package com.epam.learn.jmp.dto.cards;

import com.epam.learn.jmp.dto.User;

import java.util.Objects;


public abstract sealed class BankCard permits CreditBankCard, DebitBankCard {
    private String number;
    private User user;

    protected BankCard(String number, User user) {
        this.number = number;
        this.user = user;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankCard bankCard = (BankCard) o;
        return Objects.equals(number, bankCard.number) && Objects.equals(user, bankCard.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, user);
    }

    @Override
    public String toString() {
        return String.format("BankCard['%s', %s]", number, user);
    }
}
