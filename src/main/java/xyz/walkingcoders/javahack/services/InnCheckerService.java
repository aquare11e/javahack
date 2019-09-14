package xyz.walkingcoders.javahack.services;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import xyz.walkingcoders.javahack.dto.CheckResponse;
import xyz.walkingcoders.javahack.dto.EgrResponse;
import xyz.walkingcoders.javahack.integration.InnChecker;

@Service
public class InnCheckerService {
    @Value("${fns-api}") //todo maybe #
    private String key;

    public CheckResponse check(String inn){
        InnChecker checker= Feign.builder()
                .decoder(new JacksonDecoder())
                .target(InnChecker.class, "https://api-fns.ru");
        return checker.check(inn, key);
    }

    public EgrResponse egr(String inn){
        InnChecker checker=Feign.builder()
                .decoder(new JacksonDecoder())
                .target(InnChecker.class, "https://api-fns.ru");
        return checker.egr(inn,key);
    }


}
