package xyz.walkingcoders.javahack.db;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "account")
public class Account {

    @Column(name = "number")
    private String number;
}
