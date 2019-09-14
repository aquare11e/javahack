package xyz.walkingcoders.javahack.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import xyz.walkingcoders.javahack.db.Account;

public interface AccountRepository extends PagingAndSortingRepository<Account, Long> {
}
