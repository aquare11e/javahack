package xyz.walkingcoders.javahack.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CheckDetails {
    CheckResponse checkResponse;
    EgrResponse egrResponse;
}
