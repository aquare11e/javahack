package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;


public class Egr{
    @JsonProperty("items")
    EgrResponse[] items;
}
