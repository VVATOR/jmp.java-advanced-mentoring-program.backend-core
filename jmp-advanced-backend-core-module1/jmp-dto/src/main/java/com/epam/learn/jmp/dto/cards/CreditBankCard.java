package com.epam.learn.jmp.dto.cards;

import com.epam.learn.jmp.dto.User;


public non-sealed class CreditBankCard extends BankCard {
    public CreditBankCard(String number, User user) {
        super(number, user);
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), CreditBankCard.class.getSimpleName());
    }
}
