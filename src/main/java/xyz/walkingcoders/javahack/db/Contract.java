package xyz.walkingcoders.javahack.db;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "contract")
@NoArgsConstructor
@Getter
@Setter
public class Contract {
    @Id
    @GeneratedValue
    private Long id;

    @OneToMany
    private Client owner;

    @OneToMany
    private Counteragent counteragent;

    @Column(name = "sum")
    private BigDecimal sum;

    @Column(name="start_date")
    private LocalDateTime startDate;

    @Column(name="end_date")
    private LocalDateTime endDate;

    @ManyToOne
    private Set<Payment> payments;


}
