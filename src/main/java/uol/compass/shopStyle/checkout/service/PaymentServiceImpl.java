package uol.compass.shopStyle.checkout.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import uol.compass.shopStyle.checkout.dto.PaymentDTO;
import uol.compass.shopStyle.checkout.dto.PaymentFormDTO;
import uol.compass.shopStyle.checkout.entity.Payment;
import uol.compass.shopStyle.checkout.repository.PaymentRepository;

import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public PaymentDTO save(PaymentFormDTO form) {
        Payment paymentEntity = this.paymentRepository.save(mapper.map(form, Payment.class));
        return mapper.map(paymentEntity, PaymentDTO.class);
    }

    @Override
    public Page<PaymentDTO> findAll(Pageable page) {
        Page<Payment> payments = this.paymentRepository.findAll(page);
        return payments.map(PaymentDTO::new);
    }

    @Override
    public Optional<Payment> findById(Long id) {
        Optional<Payment> payment = paymentRepository.findById(id);
        return payment;
    }

    @Override
    public PaymentDTO update(Payment payment, PaymentFormDTO form) {
        if(form.getType() != null)payment.setType(form.getType());
        if(form.getDiscount() != null)payment.setDiscount(form.getDiscount());
        if(form.getStatus() != null)payment.setStatus(form.getStatus());

        this.paymentRepository.save(payment);
        return mapper.map(payment, PaymentDTO.class);
    }

    @Override
    public void delete(Payment payment) {
        this.paymentRepository.delete(payment);
    }
}
