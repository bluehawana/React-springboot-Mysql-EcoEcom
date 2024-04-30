package se.campusmolndal.ecodemomo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.campusmolndal.ecodemomo.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
}
