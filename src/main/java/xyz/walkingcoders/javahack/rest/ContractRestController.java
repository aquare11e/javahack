package xyz.walkingcoders.javahack.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import xyz.walkingcoders.javahack.services.ContractService;

@RestController
@RequiredArgsConstructor
public class ContractRestController {
    private final ContractService contractService;

}
