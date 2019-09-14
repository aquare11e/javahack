package xyz.walkingcoders.javahack.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.walkingcoders.javahack.dto.CheckDetails;
import xyz.walkingcoders.javahack.services.InnCheckerService;

@RestController
@RequiredArgsConstructor
public class IntegrationRestController {
    private final InnCheckerService innCheckerService;

    @RequestMapping("/api/integration/check/{inn}")
    public CheckDetails check(@PathVariable String inn){
        CheckDetails details=new CheckDetails();
        details.setCheckResponse(innCheckerService.check(inn));
        details.setEgrResponse(innCheckerService.egr(inn));
        return details;
    }
}
