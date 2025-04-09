package org.lessons.java.gamebase.Controller;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Platform;
import org.lessons.java.gamebase.Service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/admin/platforms")
public class PlatformController {
    
    @Autowired
    private PlatformService platformService;

    @GetMapping
    public String index(Model model) {
        
        List<Platform> platforms = platformService.getAll();
        model.addAttribute("platforms", platforms);

        return "platforms/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable Integer id, Model model) {

        Optional<Platform> optPlatform = platformService.getById(id);

        model.addAttribute("platform", optPlatform != null ? optPlatform.get() : false);
    
        return "platforms/show";
    }

    @GetMapping("/create")
    public String createForm(Model model) {

        model.addAttribute("platform", new Platform());

        return "platforms/create";
    }

    @PostMapping("/create")
    public String save(@Valid @ModelAttribute Platform platform, BindingResult br) {

        if(br.hasErrors()){
            return "platforms/create";
        }

        platformService.save(platform);

        return "redirect:/admin/platforms";
    }
  
    @GetMapping("/edit/{id}")
    public String editForm(Model model, @PathVariable Integer id) {

        Optional<Platform> optGenre = platformService.getById(id);

        model.addAttribute("platform", optGenre != null ? optGenre.get() : false);

        return "platforms/edit";
    }

    @PostMapping("/edit/{id}")
    public String update(@Valid @ModelAttribute Platform platform, BindingResult br, @PathVariable Integer id) {

        if(br.hasErrors()){
            return "platforms/edit";
        }

        platformService.save(platform);

        return "redirect:/admin/platforms";
    }
    

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {

        platformService.deleteById(id);

        return "redirect:/admin/platforms";
    }
    

}
