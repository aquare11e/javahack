package xyz.walkingcoders.javahack.db;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Table(name = "payment")
public class Payment {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private PaymentType type;

    @OneToOne
    private Transaction transaction;

    @OneToMany
    private Client client;

    @OneToMany
    private Counteragent counteragent;

    private Double taxValue;
    private BigDecimal taxSum;


}
