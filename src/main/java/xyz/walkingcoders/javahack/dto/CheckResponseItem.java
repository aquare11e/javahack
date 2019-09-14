package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class CheckResponseItem {

    @JsonAlias({"ИННФЛ", "ИНН"})
    String inn;

    @JsonAlias({"ОГРНИП", "ОГРН"})
    String ogrn;

    @JsonAlias("Позитив")
    CheckResponseItemPositive positive;

    @JsonAlias("Негатив")
    CheckResponseItemNegative negative;
}
