package org.lessons.java.gamebase.Service;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Game;
import org.lessons.java.gamebase.Model.Genre;
import org.lessons.java.gamebase.Repository.GameRepository;
import org.lessons.java.gamebase.Repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    
    @Autowired
    private GenreRepository repo;

    @Autowired
    private GameRepository gameRepo;

    public List<Genre> getAll(){
        return repo.findAll();
    };

    public Optional<Genre> getById(Integer id){
        Optional<Genre> attempt = repo.findById(id);

        return attempt;
    };

    public Boolean deleteById(Integer id){

        Genre genre = getById(id).isPresent() ? getById(id).get() : null; 

        if (genre != null) {
            for (Game game : genre.getGames()) {
                game.getGenres().remove(genre);
            }
            
            repo.deleteById(id);

            return true;
        }

        return false;


    }

    public void save(Genre genre){
        repo.save(genre);
    }

}
