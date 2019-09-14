package xyz.walkingcoders.javahack.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.walkingcoders.javahack.repositories.CounteragentRepository;

@Service
@RequiredArgsConstructor
public class CounteragentService {
    private final CounteragentRepository repository;
}
