package com.epam.learn.jmp.cloud.bank.functions;

import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.dto.cards.BankCard;

@FunctionalInterface
public interface BankCardConstructor {
    BankCard construct(String cardNumber, User user);
}
