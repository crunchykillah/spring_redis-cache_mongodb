package com.technokratos.agonacache.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document(collection = "users")
public class Product implements Serializable {
    @Id
    private String id;

    private String name;

    private String description;

    private Double price;
}
