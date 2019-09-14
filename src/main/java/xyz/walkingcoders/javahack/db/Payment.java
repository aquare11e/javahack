package xyz.walkingcoders.javahack.db;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "payment")
public class Payment {

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private PaymentType type;

    @OneToOne
    private Transaction transaction;

    @OneToMany
    private Client client;

    @OneToMany
    private Counteragent counteragent;
}
