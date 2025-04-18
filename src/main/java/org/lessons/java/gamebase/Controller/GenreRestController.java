package org.lessons.java.gamebase.Controller;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Game;
import org.lessons.java.gamebase.Model.Genre;
import org.lessons.java.gamebase.Service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/genres")
@CrossOrigin(origins = "http://localhost:5173")
public class GenreRestController {
    
    @Autowired
    private GenreService genreService;

    @GetMapping
    public List<Genre> index() {
        
        List<Genre> genres = genreService.getAll();

        return genres;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genre> show(@PathVariable Integer id) {

        Optional<Genre> optGenre = genreService.getById(id);

        if (optGenre.isPresent()) {
            return new ResponseEntity<Genre>(optGenre.get(), HttpStatus.OK);
        }
    
        return new ResponseEntity<Genre>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{id}/games")
    public ResponseEntity<List<Game>> getGames(@PathVariable Integer id) {

        Optional<Genre> optGenre = genreService.getById(id);

        if (optGenre.isPresent()) {
            return new ResponseEntity<List<Game>>(optGenre.get().getGames(), HttpStatus.OK);
        }
    
        return new ResponseEntity<List<Game>>(HttpStatus.NOT_FOUND);
    }

}
