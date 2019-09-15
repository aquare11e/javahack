package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;



public class EgrResponse {
    @JsonProperty("ЮЛ")
    EgrResponseItem legal;

    @JsonProperty("ИП")
    EgrResponseItem individual;
}
