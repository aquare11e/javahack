package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class CheckResponseItemNegative {
    @JsonProperty("Статус")
    String status;

    @JsonProperty("ИсклИзРеестраМСП")
    String excludedMsp;

    @JsonProperty("РегНедавно")
    String newbee;

    @JsonProperty("РеестрМассРук")
    String massDirector;

    @JsonProperty("РеестрМассУчр")
    String massOwner;

    @JsonProperty("Текст")
    String text;
}
