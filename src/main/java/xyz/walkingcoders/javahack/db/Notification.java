package xyz.walkingcoders.javahack.db;

import javax.persistence.Column;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Table(name = "notification")
public class Notification {

    @OneToMany
    private Client client;

    @Column(name = "text")
    private String text;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "active")
    private boolean active = true;
}
