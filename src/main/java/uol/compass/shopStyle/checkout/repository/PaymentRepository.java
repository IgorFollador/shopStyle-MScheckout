package uol.compass.shopStyle.checkout.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uol.compass.shopStyle.checkout.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {



}
