package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class EgrResponseItem {

    @JsonProperty("НаимПолнЮЛ")
    String nameLegal;

    @JsonProperty("ФИОПолн")
    String nameIndividual;

    @JsonProperty("Статус")
    String status;

}
