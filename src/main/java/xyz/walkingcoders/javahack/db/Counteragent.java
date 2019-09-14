package xyz.walkingcoders.javahack.db;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "counteragent")
public class Counteragent {

    @Column(name = "name")
    private String name;

    @OneToMany
    private Client owner;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private CounteragentType type;

    @Column(name = "inn")
    private String inn;

    @OneToMany
    private Account account;
}
