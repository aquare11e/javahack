package xyz.walkingcoders.javahack.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Table(name = "notification")
public class Notification {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "notification_id_seq")
    @SequenceGenerator(name = "notification_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(name = "text")
    private String text;

    @Column(name = "created")
    private LocalDateTime created;

    @Column(name = "active")
    private boolean active = true;
}
