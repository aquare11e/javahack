package xyz.walkingcoders.javahack.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import xyz.walkingcoders.javahack.db.Transaction;

public interface TransactionRepository extends PagingAndSortingRepository<Transaction, Long> {
}
