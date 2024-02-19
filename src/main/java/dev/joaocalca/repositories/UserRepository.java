package dev.joaocalca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.joaocalca.models.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findUserByDocument(String document);

    Optional<User> findUserById(Long id);
}
