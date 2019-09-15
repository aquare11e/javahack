package xyz.walkingcoders.javahack.services;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import xyz.walkingcoders.javahack.dto.Check;
import xyz.walkingcoders.javahack.dto.CheckResponse;
import xyz.walkingcoders.javahack.dto.Egr;
import xyz.walkingcoders.javahack.dto.EgrResponse;
import xyz.walkingcoders.javahack.integration.InnChecker;

@Service
public class InnCheckerService {
    @Value("${fns-api}")
    private String key;

    public Check check(String inn){
        InnChecker checker= Feign.builder()
                .decoder(new JacksonDecoder())
                .target(InnChecker.class, "https://api-fns.ru");
        Check check = checker.check(inn, key);
        System.out.println(check);
        return check;
    }

    public Egr egr(String inn){
        InnChecker checker=Feign.builder()
                .decoder(new JacksonDecoder())
                .target(InnChecker.class, "https://api-fns.ru");
        return checker.egr(inn,key);
    }
}
