package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonSerialize
public class CheckDetails {
    Check checkResponse;
    Egr egrResponse;

    public Check getCheckResponse() {
        return checkResponse;
    }

    public void setCheckResponse(Check checkResponse) {
        this.checkResponse = checkResponse;
    }

    public Egr getEgrResponse() {
        return egrResponse;
    }

    public void setEgrResponse(Egr egrResponse) {
        this.egrResponse = egrResponse;
    }
}
