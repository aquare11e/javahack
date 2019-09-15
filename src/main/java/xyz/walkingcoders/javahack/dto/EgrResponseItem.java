package xyz.walkingcoders.javahack.dto;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.security.acl.Owner;

public class EgrResponseItem {

    @JsonAlias({"ФИОПолн", "НаимПолнЮЛ"})
    String name;

    @JsonAlias("Статус")
    String status;

    @JsonAlias("Руководитель")
    String owner;
}
