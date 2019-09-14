package xyz.walkingcoders.javahack.integration;

import xyz.walkingcoders.javahack.dto.CheckResponse;
import feign.Param;
import feign.RequestLine;
import xyz.walkingcoders.javahack.dto.EgrResponse;

public interface InnChecker {
//    private String key="a942ec3ce28fe7a65ee0e1888be8edae7985a35f";
    @RequestLine("GET /api/check?req={inn}&key={key}")
    CheckResponse check(@Param("inn") String inn, @Param("key") String key);

    @RequestLine("GET /api/egr?req={inn}&key={key}")
    EgrResponse egr(@Param("inn") String inn, @Param("key") String key);
}


