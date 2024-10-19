package com.hackathon.pagbank.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "card")
public class Card {
    @Id
    private String id;
    private String name;
    private int cost;
}
