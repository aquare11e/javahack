package xyz.walkingcoders.javahack.db;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    @ManyToOne
    private Client owner;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "sum")
    private BigDecimal sum;

    @Enumerated(EnumType.STRING)
    @Column(name = "currency")
    private Currency currency;

    @ManyToOne
    private Account from;

    @ManyToOne
    private Account to;
}
