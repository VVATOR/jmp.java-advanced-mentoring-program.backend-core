package com.epam.learn.jmp.service.api;

import com.epam.learn.jmp.dto.Subscription;
import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.dto.cards.BankCard;
import com.epam.learn.jmp.service.api.functions.LegalAgeUserPredicate;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface SubscriptionServiceApi {

    void subscribe(BankCard card);

    void subscribeByDate(BankCard card, LocalDate subscriptionDate);

    Optional<Subscription> getSubscriptionByBankCardNumber(String cardNumber);

    List<User> getAllUsers();

    List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> subscriptionPredicate);

    default double getAverageUsersAge() {
        return this.getAllUsers().stream()
                .map(User::birthday)
                .mapToLong(userBirthday -> ChronoUnit.YEARS.between(userBirthday, LocalDate.now()))
                .average()
                .orElse(Double.NaN);
    }

    static boolean isPayableUser(User user) {
        return new LegalAgeUserPredicate().test(user);
    }
}