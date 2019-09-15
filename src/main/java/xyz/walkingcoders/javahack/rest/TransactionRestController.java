package xyz.walkingcoders.javahack.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import xyz.walkingcoders.javahack.services.TransactionService;

@RestController
@RequiredArgsConstructor
public class TransactionRestController {
    private final TransactionService transactionService;
}
