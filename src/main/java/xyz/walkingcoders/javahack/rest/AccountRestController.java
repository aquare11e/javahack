package xyz.walkingcoders.javahack.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import xyz.walkingcoders.javahack.services.AccountService;

@RestController
@RequiredArgsConstructor
public class AccountRestController {

    private final AccountService accountService;

}
