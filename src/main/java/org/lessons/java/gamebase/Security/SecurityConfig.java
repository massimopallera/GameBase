package org.lessons.java.gamebase.Security;

import org.lessons.java.gamebase.Service.DatabaseUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    @Bean
    @SuppressWarnings("removal")
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        http
            .authorizeHttpRequests()
            .requestMatchers("/api/**").permitAll() // o limitare se serve
            // ADMIN SECTION
            .requestMatchers(HttpMethod.GET, "/admin/*/", "/admin/*/show").hasAnyAuthority("ADMIN", "USER")
            .requestMatchers("/admin/*/create").hasAuthority("ADMIN")
            .requestMatchers("/admin/*/edit/**").hasAuthority("ADMIN")
            .requestMatchers("/admin/*/delete/**").hasAuthority("ADMIN")
            .requestMatchers("/", "/index.html", "/static/**").permitAll()
            .anyRequest().authenticated()
            .and().logout()
            .and().exceptionHandling()
            .and().formLogin()
            // .and().csrf().disable()
        ;

        return http.build();
    }


    // AuthProvider
    @Bean
    DaoAuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

        authProvider.setUserDetailsService(userDetailsService());

        authProvider.setPasswordEncoder(passwordEncoder());

        return authProvider;

    }

    // Database User Detail Service
    @Bean
    DatabaseUserDetailsService userDetailsService(){
        return new DatabaseUserDetailsService();
    }
    

    // Password Encoder
    @Bean
    PasswordEncoder passwordEncoder(){
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}
