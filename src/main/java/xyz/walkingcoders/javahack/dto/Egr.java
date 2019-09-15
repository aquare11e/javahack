package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Egr{
    @JsonAlias("items")
    EgrResponse[] items;
}
