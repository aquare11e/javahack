package xyz.walkingcoders.javahack.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import xyz.walkingcoders.javahack.services.PaymentService;

@RestController
@RequiredArgsConstructor
public class PaymentRestController {

    private final PaymentService paymentService;
}
