package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

public class EgrResponseItemOwner {
    @JsonAlias("ФИОПолн")
    String owner;
}
