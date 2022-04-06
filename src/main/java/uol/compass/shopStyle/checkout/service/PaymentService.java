package uol.compass.shopStyle.checkout.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import uol.compass.shopStyle.checkout.dto.PaymentDTO;
import uol.compass.shopStyle.checkout.dto.PaymentFormDTO;
import uol.compass.shopStyle.checkout.entity.Payment;

import java.util.Optional;

public interface PaymentService {
    PaymentDTO save(PaymentFormDTO body);

    Page<PaymentDTO> findAll(Pageable page);

    Optional<Payment> findById(Long id);

    PaymentDTO update(Payment product, PaymentFormDTO form);

    void delete(Payment product);
}
