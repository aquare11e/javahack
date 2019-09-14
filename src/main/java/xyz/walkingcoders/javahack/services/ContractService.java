package xyz.walkingcoders.javahack.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.walkingcoders.javahack.repositories.ContractRepository;

@Service
@RequiredArgsConstructor
public class ContractService {
    private final ContractRepository contractRepository;
}
