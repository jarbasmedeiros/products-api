package com.jarbasmedeiros.productsapi.resources;

import com.jarbasmedeiros.productsapi.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L,"Jarbas","jarbas@gmail.com","999999999","");

        return ResponseEntity.ok().body(u);
    }

}
