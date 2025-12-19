package tn.univ.usermicroservice.repositories;

import tn.univ.usermicroservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Méthodes personnalisées, par exemple pour trouver un utilisateur par son nom
    User findByUsername(String username);
}

