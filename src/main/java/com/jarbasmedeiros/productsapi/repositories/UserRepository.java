package com.jarbasmedeiros.productsapi.repositories;

import com.jarbasmedeiros.productsapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
