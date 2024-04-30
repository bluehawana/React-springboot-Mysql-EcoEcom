package se.campusmolndal.ecodemomo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.campusmolndal.ecodemomo.model.Order;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository <Order, String> {
    List<Order> findByProductId(String productId);
}