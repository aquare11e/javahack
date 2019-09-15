package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class CheckResponseItem {

    @JsonProperty("ИНН")
    String innLegal;

    @JsonProperty("ИННФЛ")
    String innIndividual;

    @JsonProperty("ОГРН")
    String ogrnLegal;

    @JsonProperty("ОГРНИП")
    String ogrnIndividual;


    @JsonProperty("Позитив")
    CheckResponseItemPositive positive;

    @JsonProperty("Негатив")
    CheckResponseItemNegative negative;
}
