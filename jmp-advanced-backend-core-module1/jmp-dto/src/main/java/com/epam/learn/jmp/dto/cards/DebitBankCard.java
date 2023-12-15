package com.epam.learn.jmp.dto.cards;

import com.epam.learn.jmp.dto.User;

public final class DebitBankCard extends BankCard {
    public DebitBankCard(String number, User user) {
        super(number, user);
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), DebitBankCard.class.getSimpleName());
    }
}
