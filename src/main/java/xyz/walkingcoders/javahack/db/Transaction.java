package xyz.walkingcoders.javahack.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "transaction_id_seq")
    @SequenceGenerator(name = "transaction_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id")
    private Client owner;

    @Column(name = "created")
    private LocalDateTime created;

    @Enumerated(EnumType.STRING)
    @Column(name = "direction")
    private PaymentDirection direction;

    @Column(name = "sum")
    private BigDecimal sum;

    @Enumerated(EnumType.STRING)
    @Column(name = "currency")
    private Currency currency;

    @ManyToOne
    @JoinColumn(name = "from_account_id")
    private Account from;

    @ManyToOne
    @JoinColumn(name = "to_account_id")
    private Account to;
}
