package org.lessons.java.gamebase.Repository;

import java.util.Optional;

import org.lessons.java.gamebase.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
    
    Optional<User> findByUsername(String username);

}
