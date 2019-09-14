package xyz.walkingcoders.javahack.db;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@NoArgsConstructor
@Getter
@Setter
@Table(name = "counteragent")
public class Counteragent {
    @Id
    @GeneratedValue
    private Long id;

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
