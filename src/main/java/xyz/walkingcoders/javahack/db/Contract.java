package xyz.walkingcoders.javahack.db;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Lazy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Table(name = "contract")
public class Contract {
    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "contract_id_seq")
    @SequenceGenerator(name = "contract_id_seq", allocationSize = 1)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "owner_id")
    private Client owner;

    @ManyToOne(optional = false)
    @JoinColumn(name = "counteragent_id")
    private Counteragent counteragent;

    @Column(name = "sum", nullable = false)
    private BigDecimal sum;

    @Column(name="start_date", nullable = false)
    private LocalDateTime startDate;

    @Column(name="end_date", nullable = false)
    private LocalDateTime endDate;

    @Lazy
    @OneToMany(mappedBy = "contract")
    private Set<ExpectedPayment> expectedPayments;
}
