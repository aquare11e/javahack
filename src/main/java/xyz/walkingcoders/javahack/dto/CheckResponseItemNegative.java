package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class CheckResponseItemNegative {
    @JsonAlias("Статус")
    String status;

    @JsonAlias("ИсклИзРеестраМСП")
    String excludedMsp;

    @JsonAlias("РегНедавно")
    String newbee;

    @JsonAlias("РеестрМассРук")
    String massDirector;

    @JsonAlias("РеестрМассУчр")
    String massOwner;

    @JsonAlias("Текст")
    String text;
}
