package org.lessons.java.gamebase.Service;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Game;
import org.lessons.java.gamebase.Model.Platform;
import org.lessons.java.gamebase.Repository.GameRepository;
import org.lessons.java.gamebase.Repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatformService {
    
    @Autowired
    PlatformRepository repo;

    @Autowired
    GameRepository gameRepository;

    public List<Platform> getAll(){
        return repo.findAll();
    };

    public Optional<Platform> getById(Integer id){
        Optional<Platform> attempt = repo.findById(id);

        return attempt;
    };

    // TODO Eliminare elementi relazionati (generi e piattaforme)
    public Boolean deleteById(Integer id){

        Platform platform = getById(id).isPresent() ? getById(id).get() : null;

        if (platform != null) {
            
            for (Game game : platform.getGames()) {
                game.getPlatforms().remove(platform);
            }
            repo.deleteById(id);

            return true;
        }
            
        return false;

    }

    public void save(Platform platform){
        repo.save(platform);
    }

}
