package org.lessons.java.gamebase.Controller;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Genre;
import org.lessons.java.gamebase.Service.GenreService;
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
@RequestMapping("/admin/genres")
public class GenreController {
    
    @Autowired
    private GenreService genreService;

    @GetMapping
    public String index(Model model) {
        
        List<Genre> genres = genreService.getAll();
        model.addAttribute("genres", genres);

        return "genres/index";
    }

    // @GetMapping("/{id}")
    // public String show(@PathVariable Integer id, Model model) {

    //     Optional<Genre> optGenre = genreService.getById(id);

    //     model.addAttribute("genre", optGenre != null ? optGenre.get() : false);
    
    //     return "genres/show";
    // }

    @GetMapping("/create")
    public String createForm(Model model) {

        model.addAttribute("genre", new Genre());

        return "genres/create";
    }

    @PostMapping("/create")
    public String save(@Valid @ModelAttribute Genre genre, BindingResult br) {

        if(br.hasErrors()){
            // FIXME Aggiungere Generi e Categorie 
        
            return "genres/create";
        }

        genreService.save(genre);

        return "redirect:/admin/genres";
    }
  
    @GetMapping("/edit/{id}")
    public String editForm(Model model, @PathVariable Integer id) {

        Optional<Genre> optGenre = genreService.getById(id);

        model.addAttribute("genre", optGenre != null ? optGenre.get() : false);

        return "genres/edit";
    }

    @PostMapping("/edit/{id}")
    public String update(@Valid @ModelAttribute Genre genre, BindingResult br, @PathVariable Integer id) {

        if(br.hasErrors()){
            // FIXME Aggiungere Generi e Categorie 
        
            return "genres/edit";
        }

        genreService.save(genre);

        return "redirect:/admin/genres";
    }
    

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {

        genreService.deleteById(id);

        return "redirect:/admin/genres";
    }

}
