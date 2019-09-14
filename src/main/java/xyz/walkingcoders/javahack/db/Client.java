package xyz.walkingcoders.javahack.db;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Set;

@Table(name = "client")
public class Client {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @ManyToOne
    private Set<Account> accounts;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "inn")
    private String inn;
}
