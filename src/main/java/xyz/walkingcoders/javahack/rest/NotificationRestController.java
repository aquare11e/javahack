package xyz.walkingcoders.javahack.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import xyz.walkingcoders.javahack.services.NotificationService;

@RestController
@RequiredArgsConstructor
public class NotificationRestController {

    private final NotificationService notificationService;
}
