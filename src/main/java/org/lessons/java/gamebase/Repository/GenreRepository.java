package org.lessons.java.gamebase.Repository;

import org.lessons.java.gamebase.Model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface GenreRepository extends JpaRepository<Genre, Integer>{
    
    Optional<Genre> findByName(String name);


}
