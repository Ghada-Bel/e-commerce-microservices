package tn.univ.productmicroservice.repositories;

import tn.univ.productmicroservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Vous pouvez ajouter des méthodes personnalisées ici si nécessaire
    // Par exemple :
    // List<Product> findByName(String name);
}
