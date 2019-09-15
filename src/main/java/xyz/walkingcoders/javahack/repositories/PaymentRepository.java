package xyz.walkingcoders.javahack.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import xyz.walkingcoders.javahack.db.Payment;

public interface PaymentRepository extends PagingAndSortingRepository<Payment, Long> {
}
