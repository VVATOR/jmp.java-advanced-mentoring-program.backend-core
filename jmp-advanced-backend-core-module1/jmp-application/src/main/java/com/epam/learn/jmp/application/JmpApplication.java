package com.epam.learn.jmp.application;


import com.epam.learn.jmp.application.services.ApplicationDemoService;
import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.dto.cards.types.BankCardType;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JmpApplication {
    public static void main(String[] args) {
        final var jmpDemoApp = new ApplicationDemoService();

        System.out.printf("%n=> Create bank cards for users <=%n");
        final var user1 = new User("Tom", "Cruise", LocalDate.of(1962, 3, 7));
        final var bankCard1 = jmpDemoApp.getBankCard(user1, BankCardType.DEBIT);
        final var bankCard1_1 = jmpDemoApp.getBankCard(user1, BankCardType.DEBIT);
        final var bankCard1_2 = jmpDemoApp.getBankCard(user1, BankCardType.CREDIT);
        final var bankCardNotSubscribedDebitCard = jmpDemoApp.getBankCard(user1, BankCardType.DEBIT);
        final var bankCardNotSubscribedCreditCard = jmpDemoApp.getBankCard(user1, BankCardType.CREDIT);

        final var user2 = new User("Margot", "Robbie", LocalDate.of(1990, 7, 2));
        final var bankCard2 = jmpDemoApp.getBankCard(user2, BankCardType.CREDIT);

        final var user3 = new User("Jennifer", "Lawrence", LocalDate.of(2000, 8, 16));
        final var bankCard3 = jmpDemoApp.getBankCard(user3, BankCardType.DEBIT);

        final var user4 = new User("Justin", "Bieber", LocalDate.of(2015, 6, 15));
        final var bankCard4 = jmpDemoApp.getBankCard(user4, BankCardType.CREDIT);

        System.out.printf("%n=> Subscribe bank card <=%n");
        jmpDemoApp.subscribeByDate(bankCard1, LocalDate.of(1981, 1, 1));
        jmpDemoApp.subscribeByDate(bankCard2, LocalDate.now().minusWeeks(1));
        jmpDemoApp.subscribeByDate(bankCard3, LocalDate.now().minusDays(16));
        jmpDemoApp.subscribe(bankCard4);
        jmpDemoApp.subscribe(bankCard1_1);


        System.out.printf("%n=> Get subscription by condition (subscriptions created not longer than) <=%n");
        jmpDemoApp.getSubscriptionsByCondition(2, ChronoUnit.DAYS);
        jmpDemoApp.getSubscriptionsByCondition(2, ChronoUnit.WEEKS);
        jmpDemoApp.getSubscriptionsByCondition(3, ChronoUnit.MONTHS);
        jmpDemoApp.getSubscriptionsByCondition(1, ChronoUnit.CENTURIES);

        System.out.printf("%n=> Get subscription by bank card number <=%n");
        jmpDemoApp.getSubscriptionByBankCardNumber(bankCard1);


        System.out.printf("%n=> Is User payable <=%n");
        jmpDemoApp.isPayableUser(user1);
        jmpDemoApp.isPayableUser(user2);
        jmpDemoApp.isPayableUser(user3);
        jmpDemoApp.isPayableUser(user4);

        System.out.printf("%n=> Average age <=%n");
        jmpDemoApp.averageAgeAllUsers();


        System.out.printf("%n=> Subscription present <=%n");
        jmpDemoApp.getSubscriptionByUserCard(bankCard1);
        jmpDemoApp.getSubscriptionByUserCard(bankCard2);

        System.out.printf("%n=> Throws exception if subscription not found <=%n");
        jmpDemoApp.getSubscriptionByUserCard(bankCardNotSubscribedCreditCard);
        jmpDemoApp.getSubscriptionByUserCard(bankCardNotSubscribedDebitCard);
    }
}
