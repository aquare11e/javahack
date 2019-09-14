package xyz.walkingcoders.javahack.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDate;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Table(name = "expected_payment")
public class ExpectedPayment {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "expected_payment_id_seq")
    @SequenceGenerator(name = "expected_payment_id_seq", allocationSize = 1)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "direction", nullable = false)
    private PaymentDirection direction;

    @OneToOne
    @JoinColumn(name = "payment_id")
    private Payment payment;

    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id", nullable = false)
    private Client owner;

    @ManyToOne(optional = false)
    @JoinColumn(name = "counteragent_id")
    private Counteragent counteragent;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private Contract contract;

    @Column(name = "last_payment_day", columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDate lastPaymentDay;
}
