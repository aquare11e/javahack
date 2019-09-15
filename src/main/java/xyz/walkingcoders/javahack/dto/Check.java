package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Check{
    @JsonAlias("items")
    EgrResponse[] items;
}
