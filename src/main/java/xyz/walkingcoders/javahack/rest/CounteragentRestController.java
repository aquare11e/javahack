package xyz.walkingcoders.javahack.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import xyz.walkingcoders.javahack.services.CounteragentService;

@RestController
@RequiredArgsConstructor
public class CounteragentRestController {
    private final CounteragentService counteragentService;
}
