package xyz.walkingcoders.javahack.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import xyz.walkingcoders.javahack.db.Counteragent;
import xyz.walkingcoders.javahack.exception.NotFoundException;
import xyz.walkingcoders.javahack.repositories.CounteragentRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CounteragentService {
    private final CounteragentRepository repository;

    public List<Counteragent> getCounteragentsList(int page, int nRecords) {
        Page<Counteragent> counteragentPage =
            repository.findAll(PageRequest.of(page, nRecords, Sort.by("id").ascending()));

        return counteragentPage.get().collect(Collectors.toList());
    }

    public Counteragent getCounteragentById(long id) {
        Optional<Counteragent> counteragentOptional = repository.findById(id);
        if (counteragentOptional.isPresent()) {
            return counteragentOptional.get();
        }

        throw new NotFoundException(Counteragent.class, id);
    }

    public Counteragent createCounteragent(Counteragent counteragent) {
        return repository.save(counteragent);
    }
}
