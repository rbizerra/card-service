package com.hackathon.pagbank.util.mapper;

import com.hackathon.pagbank.domain.Card;
import com.hackathon.pagbank.domain.dto.CardDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CardMapper {
    CardDTO cardToCardDto(Card card);

    Card cardDtoToCard(CardDTO card);

    List<CardDTO> cardListToCardDtoList(List<Card> cards);

    List<Card> cardDtoListToCardList(List<CardDTO> cards);
}
