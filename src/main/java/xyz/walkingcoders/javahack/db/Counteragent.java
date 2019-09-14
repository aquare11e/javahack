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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Table(name = "counteragent")
public class Counteragent {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "counteragent_id_seq")
    @SequenceGenerator(name = "counteragent_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id")
    private Client owner;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false)
    private CounteragentType type;

    @Column(name = "inn")
    private String inn;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
}
