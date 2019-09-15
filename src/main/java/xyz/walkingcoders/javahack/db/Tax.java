package xyz.walkingcoders.javahack.db;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.math.BigDecimal;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter
@Setter
@Entity
@Table(name = "tax")
public class Tax {

    @Id
    @GeneratedValue(strategy=SEQUENCE, generator = "tax_id_seq")
    @SequenceGenerator(name = "tax_id_seq", allocationSize = 1)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "payment_id", nullable = false)
    private Payment payment;

    @Column(name = "percent", nullable = false)
    private BigDecimal percent;

    @Column(name = "sum", nullable = false)
    private BigDecimal sum;
}
