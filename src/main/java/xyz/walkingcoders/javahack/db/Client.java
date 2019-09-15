package xyz.walkingcoders.javahack.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Table(name = "client")
public class Client  {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "client_id_seq")
    @SequenceGenerator(name = "client_id_seq", allocationSize = 1)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "client_account",
        joinColumns = { @JoinColumn(name = "client_id") },
        inverseJoinColumns = { @JoinColumn(name = "account_id") }
    )
    private Set<Account> accounts = new HashSet<>();

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "inn")
    private String inn;
}
