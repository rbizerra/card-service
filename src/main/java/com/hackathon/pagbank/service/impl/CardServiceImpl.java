package com.hackathon.pagbank.service.impl;

import com.hackathon.pagbank.domain.Card;
import com.hackathon.pagbank.domain.dto.CardDTO;
import com.hackathon.pagbank.repository.CardRepository;
import com.hackathon.pagbank.service.CardService;
import com.hackathon.pagbank.util.mapper.CardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {
    @Autowired
    private CardRepository cardRepository;
    @Autowired
    private CardMapper cardMapper;

    @Override
    public CardDTO create(CardDTO card) {
        log.info("Creating card...");
        Card savedCard = cardRepository.save(cardMapper.cardDtoToCard(card));
        log.info("Card create successfully.");
        return cardMapper.cardToCardDto(savedCard);
    }
}
