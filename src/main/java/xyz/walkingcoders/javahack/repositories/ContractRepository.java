package xyz.walkingcoders.javahack.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import xyz.walkingcoders.javahack.db.Contract;

public interface ContractRepository extends PagingAndSortingRepository<Contract, Long> {

}
