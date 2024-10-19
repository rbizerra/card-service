package com.hackathon.pagbank.repository;

import com.hackathon.pagbank.domain.Card;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends MongoRepository<Card, String> {
}
