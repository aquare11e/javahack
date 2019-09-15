package xyz.walkingcoders.javahack.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.walkingcoders.javahack.repositories.PaymentRepository;

@Service
@RequiredArgsConstructor
public class PaymentService {

    private final PaymentRepository paymentRepository;
}
