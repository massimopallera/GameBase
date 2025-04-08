package org.lessons.java.gamebase.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Game;
import org.lessons.java.gamebase.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
// @RestController
@RequestMapping("/admin/games")
public class GameController {
    
    @Autowired
    private GameService gameService;

    @GetMapping
    public String index(Model model) {
        
        List<Game> games = gameService.getAll();
        model.addAttribute("games", games);

        return "games/index";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable Integer id, Model model) {

        Optional<Game> optGame = gameService.getById(id);

        model.addAttribute("game", optGame != null ? optGame.get() : false);
    
        return "games/show";
    }

    @GetMapping("/create")
    public String createForm(Model model) {

        model.addAttribute("game", new Game());

        return "games/create";
    }

    @PostMapping("/create")
    public String save(@Valid @ModelAttribute Game game, BindingResult br) {

        if(br.hasErrors()){
            // FIXME Aggiungere Generi e Categorie 
        
            return "games/create";
        }

        gameService.save(game);

        return "redirect:/admin/games";
    }
  
    @GetMapping("/edit/{id}")
    public String editForm(Model model, @PathVariable Integer id) {

        Optional<Game> optGame = gameService.getById(id);

        model.addAttribute("game", optGame != null ? optGame.get() : false);

        return "games/edit";
    }

    @PostMapping("/edit/{id}")
    public String update(@Valid @ModelAttribute Game game, BindingResult br, @PathVariable Integer id) {

        if(br.hasErrors()){
            // FIXME Aggiungere Generi e Categorie 
        
            return "games/edit";
        }

        gameService.save(game);

        return "redirect:/admin/games";
    }
    

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {

        gameService.deleteById(id);

        return "redirect:/admin/games";
    }

}