package com.epam.learn.jmp.bank.api;


import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.dto.cards.BankCard;
import com.epam.learn.jmp.dto.cards.types.BankCardType;

public interface BankApi {
    BankCard createBankCard(User user, BankCardType bankCardType);
}
