package org.lessons.java.gamebase.Controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/")
public class HomeController {
    
    @GetMapping
    public String index(Principal principal) {
        // check if authenticated
        if(principal != null){
            // System.out.println(principal.getName());
            return "redirect:/admin/games";
        } 
        return "redirect:/login";
    }
    

}
