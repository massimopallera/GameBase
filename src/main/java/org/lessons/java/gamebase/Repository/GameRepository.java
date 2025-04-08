package org.lessons.java.gamebase.Repository;
import org.lessons.java.gamebase.Model.Game;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GameRepository extends JpaRepository<Game, Integer>{

}
