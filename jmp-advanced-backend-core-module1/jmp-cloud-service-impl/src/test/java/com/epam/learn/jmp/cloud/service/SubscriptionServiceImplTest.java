package com.epam.learn.jmp.cloud.service;

import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.dto.cards.CreditBankCard;
import com.epam.learn.jmp.dto.cards.DebitBankCard;
import com.epam.learn.jmp.service.api.SubscriptionServiceApi;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

@DisplayName("SubscriptionServiceImpl tests.")
class SubscriptionServiceImplTest {

    @Test
    @DisplayName("Subscribe a few types of bank cards for the same user.")
    void subscribeFewTypesOfBankCardsForSameTheUser() {
        final SubscriptionServiceApi subscriptionServiceApi = new SubscriptionServiceImpl();
        final var birthday = LocalDate.now().minusYears(19);
        final var user = new User("Jackie", "Chan", birthday);
        subscriptionServiceApi.subscribe(new CreditBankCard("1234-1234-1234-1234", user));
        subscriptionServiceApi.subscribe(new DebitBankCard("4321-4321-4321-4321", user));
        final var subscriptionByBankCardNumber1 = subscriptionServiceApi.getSubscriptionByBankCardNumber("1234-1234-1234-1234");
        final var subscriptionByBankCardNumber2 = subscriptionServiceApi.getSubscriptionByBankCardNumber("4321-4321-4321-4321");
        Assertions.assertTrue(subscriptionByBankCardNumber1.isPresent());
        Assertions.assertTrue(subscriptionByBankCardNumber2.isPresent());
    }

    @Test
    @DisplayName("Fail subscription if user is null.")
    void failSubscriptionIfUserIsNull() {
        final SubscriptionServiceApi subscriptionServiceApi = new SubscriptionServiceImpl();
        final var expectedExceptionClass = NullPointerException.class;
        final var actualException = Assertions.assertThrows(expectedExceptionClass, () ->
                subscriptionServiceApi.subscribe(null));
        Assertions.assertEquals(expectedExceptionClass, actualException.getClass());
    }


    @Test
    @DisplayName("One user have a few subscriptions by bank cards numbers.")
    void oneUserHaveFewSubscribedBankCards() {
        final SubscriptionServiceApi subscriptionServiceApi = new SubscriptionServiceImpl();
        final var birthday = LocalDate.now().minusYears(19);
        final var user1 = new User("Katy", "Perry", birthday);
        subscriptionServiceApi.subscribe(new CreditBankCard("1234-1234-1234-1234", user1));
        subscriptionServiceApi.subscribe(new DebitBankCard("4321-4321-4321-4321", user1));
        final var subscriptionByBankCardNumber1 = subscriptionServiceApi.getSubscriptionByBankCardNumber("1234-1234-1234-1234");
        final var subscriptionByBankCardNumber2 = subscriptionServiceApi.getSubscriptionByBankCardNumber("4321-4321-4321-4321");
        final var allUsers = subscriptionServiceApi.getAllUsers();

        Assertions.assertTrue(subscriptionByBankCardNumber1.isPresent());
        Assertions.assertTrue(subscriptionByBankCardNumber2.isPresent());
        Assertions.assertEquals(1, allUsers.size());
    }

    @Test
    @DisplayName("Get subscriptions by bank cards numbers for a few users.")
    void fewSubscriptionsForDifferentUsers() {
        final SubscriptionServiceApi subscriptionServiceApi = new SubscriptionServiceImpl();
        final var birthday = LocalDate.now().minusYears(19);
        final var user1 = new User("Katty", "Perry", birthday);
        final var user2 = new User("Ryan", "Gosling", birthday);
        subscriptionServiceApi.subscribe(new CreditBankCard("1234-1234-1234-1234", user1));
        subscriptionServiceApi.subscribe(new CreditBankCard("4321-4321-4321-4321", user2));
        final var subscriptionByBankCardNumber1 = subscriptionServiceApi.getSubscriptionByBankCardNumber("1234-1234-1234-1234");
        final var subscriptionByBankCardNumber2 = subscriptionServiceApi.getSubscriptionByBankCardNumber("4321-4321-4321-4321");
        final var allUsers = subscriptionServiceApi.getAllUsers();

        Assertions.assertTrue(subscriptionByBankCardNumber1.isPresent());
        Assertions.assertTrue(subscriptionByBankCardNumber2.isPresent());
        Assertions.assertEquals(2, allUsers.size());
    }

    @Test
    @DisplayName("Get all subscriptions by condition that registered last month.")
    void getAllSubscriptionsByConditionThatRegisteredLastMonth() {
        final SubscriptionServiceApi subscriptionServiceApi = new SubscriptionServiceImpl();
        final var name = "Katty";
        final var surname = "Perry";
        final var birthday = LocalDate.now().minusYears(19);
        final var user1 = new User(name, surname, birthday);
        final var user2 = new User(name, surname, birthday);
        subscriptionServiceApi.subscribe(new CreditBankCard("1234-1234-1234-1234", user1));
        subscriptionServiceApi.subscribe(new CreditBankCard("4321-4321-4321-4321", user2));
        final var allSubscriptionsByCondition = subscriptionServiceApi.getAllSubscriptionsByCondition(
                subscription -> subscription.startDate().isAfter(LocalDate.now().minusMonths(1))
        );

        Assertions.assertEquals(2, allSubscriptionsByCondition.size());
    }
}