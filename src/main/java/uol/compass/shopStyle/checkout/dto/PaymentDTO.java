package uol.compass.shopStyle.checkout.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import uol.compass.shopStyle.checkout.entity.Payment;

@Data
@NoArgsConstructor
public class PaymentDTO {

    private Long id;

    private String type;

    private Integer discount;

    private Boolean status;

    public PaymentDTO(Payment payment) {
        this.id = payment.getId();
        this.type = payment.getType();
        this.discount = payment.getDiscount();
        this.status = payment.getStatus();
    }
}
