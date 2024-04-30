package se.campusmolndal.ecodemomo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.campusmolndal.ecodemomo.model.Receipt;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, String> {
}