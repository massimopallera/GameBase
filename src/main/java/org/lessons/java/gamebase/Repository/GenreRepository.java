package org.lessons.java.gamebase.Repository;

import org.lessons.java.gamebase.Model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer>{
    
}
