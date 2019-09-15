package xyz.walkingcoders.javahack.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.walkingcoders.javahack.db.Counteragent;
import xyz.walkingcoders.javahack.services.CounteragentService;
import xyz.walkingcoders.javahack.services.UserService;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/counteragent")
public class CounteragentRestController {
    private final CounteragentService counteragentService;

    @GetMapping
    public ResponseEntity<List<Counteragent>> getListCounteragents(
        @RequestParam(value = "page", defaultValue = "0") int page,
        @RequestParam(value = "size", defaultValue = "10") int size
    ) {
        return ResponseEntity.ok(counteragentService.getCounteragentsList(page, size));
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Counteragent> createCounteragent(Counteragent counteragent) {
        counteragent.setOwner(UserService.getClient());
        return ResponseEntity.ok(counteragentService.createCounteragent(counteragent));
    }
}
