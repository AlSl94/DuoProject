package ru.duo.DUO.model;

import lombok.Data;

@Data
public class Post {
    long userId;
    long id;
    String title;
    String body;
}
