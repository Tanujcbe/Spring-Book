package com.example.Books.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Getter
@Setter
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String genre;

    // Constructor, getters and setters
}

