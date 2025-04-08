package org.lessons.java.gamebase.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.lessons.java.gamebase.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
    
}
