package org.lessons.java.gamebase.Service;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Game;
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

    // TODO Eliminare elementi relazionati (generi e piattaforme)
    public void deleteById(Integer id){
        repo.deleteById(id);
    }

    public void save(Game game){
        repo.save(game);
    }

}
