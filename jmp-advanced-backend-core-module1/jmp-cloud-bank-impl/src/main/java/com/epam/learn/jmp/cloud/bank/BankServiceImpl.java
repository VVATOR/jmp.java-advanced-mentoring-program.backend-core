package com.epam.learn.jmp.cloud.bank;

import com.epam.learn.jmp.bank.api.BankApi;
import com.epam.learn.jmp.cloud.bank.algorithms.UniqueBankCardNumberGenerator;
import com.epam.learn.jmp.cloud.bank.functions.BankCardConstructor;
import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.dto.cards.BankCard;
import com.epam.learn.jmp.dto.cards.CreditBankCard;
import com.epam.learn.jmp.dto.cards.DebitBankCard;
import com.epam.learn.jmp.dto.cards.types.BankCardType;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class BankServiceImpl implements BankApi {
    private static final Map<String, BankCard> releasedBankCardRepository = new ConcurrentHashMap<>();

    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {

        final var cardNumber = UniqueBankCardNumberGenerator.getUniqueCardNumber();
        final BankCardConstructor cardConstructor = switch (bankCardType) {
            case CREDIT -> CreditBankCard::new;
            case DEBIT -> DebitBankCard::new;
        };
        final var card = cardConstructor.construct(cardNumber, user);
        releasedBankCardRepository.put(cardNumber, card);
        return card;
    }

    public static List<BankCard> getAllReleasedBankCards() {
        return releasedBankCardRepository.values()
                .stream()
                .toList();
    }


}