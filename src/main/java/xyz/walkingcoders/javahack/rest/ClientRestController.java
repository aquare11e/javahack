package xyz.walkingcoders.javahack.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import xyz.walkingcoders.javahack.services.ClientService;

@RestController
@RequiredArgsConstructor
public class ClientRestController {

    private final ClientService clientService;


}
