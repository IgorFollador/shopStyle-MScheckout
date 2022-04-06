package uol.compass.shopStyle.checkout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uol.compass.shopStyle.checkout.dto.PaymentDTO;
import uol.compass.shopStyle.checkout.dto.PaymentFormDTO;
import uol.compass.shopStyle.checkout.service.PaymentService;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<PaymentDTO> save(@RequestBody @Valid PaymentFormDTO body) {
        PaymentDTO payments = this.paymentService.save(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(payments);
    }

}
