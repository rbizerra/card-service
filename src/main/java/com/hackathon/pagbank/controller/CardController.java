package com.hackathon.pagbank.controller;

import com.hackathon.pagbank.domain.dto.CardDTO;
import com.hackathon.pagbank.service.CardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    private CardService cardService;

    @PostMapping
    public ResponseEntity<CardDTO> create(@RequestBody CardDTO card) {
        return ResponseEntity.ok(cardService.create(card));
    }
}
