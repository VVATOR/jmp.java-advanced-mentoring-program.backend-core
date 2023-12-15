package com.epam.learn.jmp.cloud.bank;

import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.dto.cards.types.BankCardType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;


@DisplayName("Bank service tests.")
class BankServiceImplTest {

    @Test
    @DisplayName("Create banks cards for user.")
    void createFewTypesBanksCardsForUser() {
        final var bankService = new BankServiceImpl();
        final var birthday = LocalDate.now().minusYears(19);
        final var user = new User("Scarlett", "Johnson", birthday);
        bankService.createBankCard(user, BankCardType.DEBIT);
        bankService.createBankCard(user, BankCardType.CREDIT);
        final var allReleasedBankCards = BankServiceImpl.getAllReleasedBankCards();
        Assertions.assertEquals(2, allReleasedBankCards.size());
    }
}