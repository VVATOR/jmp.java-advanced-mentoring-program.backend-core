package com.epam.learn.jmp.cloud.service;

import com.epam.learn.jmp.dto.Subscription;
import com.epam.learn.jmp.dto.User;
import com.epam.learn.jmp.dto.cards.BankCard;
import com.epam.learn.jmp.service.api.SubscriptionServiceApi;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;

public class SubscriptionServiceImpl implements SubscriptionServiceApi {
    private final Map<String, Subscription> subscriptionRepository = new ConcurrentHashMap<>();
    private final Map<Integer, User> userRepository = new ConcurrentHashMap<>();

    @Override
    public void subscribe(BankCard bankCard) {
        subscribeByDate(bankCard, LocalDate.now());
    }

    @Override
    public void subscribeByDate(BankCard card, LocalDate subscriptionDate) {
        var subscription = new Subscription(card.getNumber(), subscriptionDate);
        subscriptionRepository.put(subscription.bankcard(), subscription);

        var user = card.getUser();
        userRepository.put(user.hashCode(), user);
    }

    @Override
    public Optional<Subscription> getSubscriptionByBankCardNumber(String bankCardNumber) {
        return Optional.ofNullable(subscriptionRepository.get(bankCardNumber));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.values()
                .stream()
                .toList(); // better than Collectors.toUnmodifiableList()
    }

    @Override
    public List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> subscriptionPredicate) {
        return subscriptionRepository.values().stream()
                .filter(subscriptionPredicate)
                .toList();
    }
}