package org.lessons.java.gamebase.Repository;
import org.lessons.java.gamebase.Model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;



public interface GameRepository extends JpaRepository<Game, Integer>{

    List<Game> findByTitleContainingIgnoreCase(String title);

}
