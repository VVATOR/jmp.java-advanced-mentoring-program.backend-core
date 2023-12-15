package com.epam.learn.jmp.application.services;


import com.epam.learn.jmp.application.exceptions.NotFoundSubscriptionException;
import com.epam.learn.jmp.bank.api.BankApi;
import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.dto.cards.BankCard;
import com.epam.learn.jmp.dto.cards.types.BankCardType;
import com.epam.learn.jmp.service.api.SubscriptionServiceApi;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ServiceLoader;

public class ApplicationDemoService {
    private final BankApi bankService = ServiceLoader.load(BankApi.class).findFirst()
            .orElseThrow(() -> new IllegalStateException("No implementation of Bank service found."));
    private final SubscriptionServiceApi subscriptionService = ServiceLoader.load(SubscriptionServiceApi.class).findFirst()
            .orElseThrow(() -> new IllegalStateException("No implementation of Bank service found."));


    public BankCard getBankCard(User user, BankCardType cardType) {
        final var card = bankService.createBankCard(user, cardType);
        System.out.printf("CREATED %s%n", card);
        return card;
    }

    public void subscribe(BankCard card) {
        subscribeByDate(card, LocalDate.now());
    }

    public void subscribeByDate(BankCard card, LocalDate subscriptionDate) {
        subscriptionService.subscribeByDate(card, subscriptionDate);
        System.out.printf("SUBSCRIBED %s%n", card);
    }

    public void getSubscriptionByUserCard(BankCard card) {
        try {
            final var subscription = subscriptionService.getSubscriptionByBankCardNumber(card.getNumber())
                    .orElseThrow(() -> new NotFoundSubscriptionException("Subscription not found!"));
            System.out.printf("Subscription start date '%s' for %s%n", subscription.startDate(), card);
        } catch (NotFoundSubscriptionException e) {
            System.err.printf("%s: %s%n", e.getMessage(), card);
        }
    }

    public void getSubscriptionsByCondition(int number, ChronoUnit unit) {
        final var calculatedDate = LocalDate.now().minus(number, unit);
        final var subscriptionsByCondition = subscriptionService.getAllSubscriptionsByCondition(subscription ->
                subscription.startDate().isAfter(calculatedDate)
        );
        System.out.printf("Count subscriptions created not longer %d %s (%s %s): %d%n", number, unit, calculatedDate, LocalDate.now(), subscriptionsByCondition.size());
    }

    public void getSubscriptionByBankCardNumber(BankCard card) {
        System.out.println(card);
        final var subscription = subscriptionService.getSubscriptionByBankCardNumber(card.getNumber())
                .orElseThrow(() -> new NotFoundSubscriptionException("Subscription not found"));
        System.out.println("getSubscriptionByBankCardNumber: " + subscription.startDate());
    }

    public void isPayableUser(User user) {
        final var isUser3Payable = SubscriptionServiceApi.isPayableUser(user);
        System.out.printf("%s is payable: %s%n", user, isUser3Payable);
    }

    public void averageAgeAllUsers() {
        double averageAge = subscriptionService.getAverageUsersAge();
        System.out.printf("Average Users Age: %s%n", averageAge);
    }
}
