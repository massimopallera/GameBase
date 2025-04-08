package org.lessons.java.gamebase.Repository;

import org.lessons.java.gamebase.Model.Platform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatformRepository extends JpaRepository<Platform, Integer>{
    
}
