package org.lessons.java.gamebase.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Game;
import org.lessons.java.gamebase.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/games")
@CrossOrigin(origins = "http://localhost:5173")
public class GameRestController {
    
    @Autowired
    private GameService gameService;
    
    @GetMapping
    public List<Game> index(@RequestParam(required = false) String title) {
        
        List<Game> games = new ArrayList<Game>();

        if(title != null){
            games = gameService.findByTitleContainingIgnoreCase(title);
        } else{
            games = gameService.getAll();
        }


        return games;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Game> show(@PathVariable Integer id) {

        Optional<Game> optGame = gameService.getById(id);

        if(optGame.isPresent()){
            return new ResponseEntity<Game>(optGame.get(), HttpStatus.OK);
        }
    
        return new ResponseEntity<Game>(HttpStatus.NOT_FOUND);
    }    

}
