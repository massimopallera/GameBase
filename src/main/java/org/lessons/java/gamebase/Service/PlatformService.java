package org.lessons.java.gamebase.Service;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Platform;
import org.lessons.java.gamebase.Repository.PlatformRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlatformService {
    
    @Autowired
    PlatformRepository repo;

    public List<Platform> getAll(){
        return repo.findAll();
    };

    public Optional<Platform> getById(Integer id){
        Optional<Platform> attempt = repo.findById(id);

        return attempt;
    };

    // TODO Eliminare elementi relazionati (generi e piattaforme)
    public void deleteById(Integer id){
        repo.deleteById(id);
    }

    public void save(Platform platform){
        repo.save(platform);
    }

}
