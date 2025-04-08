package org.lessons.java.gamebase.Service;

import java.util.Optional;

import org.lessons.java.gamebase.Model.User;
import org.lessons.java.gamebase.Repository.UserRepository;
import org.lessons.java.gamebase.Security.DatabaseUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DatabaseUserDetailsService implements UserDetailsService{
    
    @Autowired
    private UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{

        Optional<User> attemptUser = userRepo.findByUsername(username);

        if(attemptUser.isEmpty()){
            throw new UsernameNotFoundException("Account not found");
        }

        return new DatabaseUserDetails(attemptUser.get());


    }

}
