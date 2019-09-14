package xyz.walkingcoders.javahack.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import xyz.walkingcoders.javahack.db.Notification;

public interface NotificationRepository extends PagingAndSortingRepository<Notification, Long> {

}
