package xyz.walkingcoders.javahack.db;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
    @JoinColumn(name = "transaction_id")
    private Transaction transaction;

    @OneToMany
    private Client client;

    @OneToMany
    private Counteragent counteragent;

    @Column(name = "last_payment_day")
    private LocalDate lastPaymentDay;

    private Double taxAmount;

    private BigDecimal taxSum;


}
