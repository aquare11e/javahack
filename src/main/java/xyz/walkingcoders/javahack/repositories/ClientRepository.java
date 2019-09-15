package xyz.walkingcoders.javahack.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import xyz.walkingcoders.javahack.db.Client;

public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

}
