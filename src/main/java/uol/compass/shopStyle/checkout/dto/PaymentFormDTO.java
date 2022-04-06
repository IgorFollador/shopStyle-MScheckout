package uol.compass.shopStyle.checkout.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PaymentFormDTO {

    private String type;

    private Integer discount;

    private Boolean status;

}
