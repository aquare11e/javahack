package xyz.walkingcoders.javahack.integration;

import xyz.walkingcoders.javahack.dto.Check;
import xyz.walkingcoders.javahack.dto.CheckResponse;
import feign.Param;
import feign.RequestLine;
import xyz.walkingcoders.javahack.dto.Egr;
import xyz.walkingcoders.javahack.dto.EgrResponse;

public interface InnChecker {
//    private String key="6a50edb7e305c8e1f2abecf77325656c1eeb21f7";
    @RequestLine("GET /api/check?req={inn}&key={key}")
    Check check(@Param("inn") String inn, @Param("key") String key);

    @RequestLine("GET /api/egr?req={inn}&key={key}")
    Egr egr(@Param("inn") String inn, @Param("key") String key);
}


