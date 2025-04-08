package org.lessons.java.gamebase.Service;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Genre;
import org.lessons.java.gamebase.Repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService {
    
    @Autowired
    private GenreRepository repo;

    public List<Genre> getAll(){
        return repo.findAll();
    };

    public Optional<Genre> getById(Integer id){
        Optional<Genre> attempt = repo.findById(id);

        return attempt;
    };

    public void deleteById(Integer id){
        repo.deleteById(id);
    }

    public void save(Genre genre){
        repo.save(genre);
    }

}
