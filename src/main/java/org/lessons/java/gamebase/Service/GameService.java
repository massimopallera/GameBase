package org.lessons.java.gamebase.Service;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Game;
import org.lessons.java.gamebase.Model.Genre;
import org.lessons.java.gamebase.Model.Platform;
import org.lessons.java.gamebase.Repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    
    @Autowired
    GameRepository repo;

    public List<Game> getAll(){
        return repo.findAll();
    };

    public Optional<Game> getById(Integer id){
        Optional<Game> attempt = repo.findById(id);

        return attempt;
    };
    public List<Game> findByTitleContainingIgnoreCase(String partialTitle){
        List<Game> attempt = repo.findByTitleContainingIgnoreCase(partialTitle);

        return attempt;
    };

    // TODO Eliminare elementi relazionati (generi e piattaforme)
    public Boolean deleteById(Integer id){

        Game game = getById(id).isPresent() ? getById(id).get() : null;

        if (game != null) {
            
            for (Genre genre : game.getGenres()) {
                
                genre.getGames().remove(game);

            }

            for (Platform platform : game.getPlatforms()) {
                
                platform.getGames().remove(game);

            }

            repo.deleteById(id);
            return false;
        }

        return false;
    }

    public void save(Game game){
        repo.save(game);
    }

}
