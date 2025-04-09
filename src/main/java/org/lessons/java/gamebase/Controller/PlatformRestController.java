package org.lessons.java.gamebase.Controller;

import java.util.List;
import java.util.Optional;

import org.lessons.java.gamebase.Model.Platform;
import org.lessons.java.gamebase.Service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/platforms")
public class PlatformRestController {

      @Autowired
    private PlatformService platformService;

    @GetMapping
    public List<Platform> index() {
        
        List<Platform> platforms = platformService.getAll();

        return platforms;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Platform> show(@PathVariable Integer id) {

        Optional<Platform> optPlatform = platformService.getById(id);

        if (optPlatform.isPresent()) {
            return new ResponseEntity<Platform>(optPlatform.get(), HttpStatus.OK);
        }
    
        return new ResponseEntity<Platform>(HttpStatus.NOT_FOUND);
    }

}
