package uol.compass.shopStyle.checkout.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private Integer discount;

    @Column(nullable = false)
    private Boolean status;


}
