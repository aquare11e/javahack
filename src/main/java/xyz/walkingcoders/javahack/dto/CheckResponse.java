package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class CheckResponse {
    @JsonProperty("ЮЛ")
    CheckResponseItem legal;

    @JsonProperty("ИП")
    CheckResponse individual;
}
