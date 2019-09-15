package xyz.walkingcoders.javahack.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import xyz.walkingcoders.javahack.db.Counteragent;

public interface CounteragentRepository extends PagingAndSortingRepository<Counteragent, Long> {
}
