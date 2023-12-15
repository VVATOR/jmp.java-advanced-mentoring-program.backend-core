package com.epam.learn.jmp.cloud.bank.algorithms;

import java.util.HashSet;
import java.util.Set;
import java.util.SplittableRandom;

public final class UniqueBankCardNumberGenerator {
    private static final Set<String> generatedCardNumbers = new HashSet<>();
    private static final String CARD_NUMBER_PARTS_SEPARATOR = "-";

    private UniqueBankCardNumberGenerator() {
        throw new AssertionError();
    }

    public static synchronized String getUniqueCardNumber() {
        String cardNumber;
        do {
            cardNumber = generateRandomCardNumber();
        } while (!isUnique(cardNumber));

        generatedCardNumbers.add(cardNumber);
        return cardNumber;
    }

    private static boolean isUnique(String cardNumber) {
        return !generatedCardNumbers.contains(cardNumber);
    }

    private static String generateRandomCardNumber() {
        return getRandomInRange() + CARD_NUMBER_PARTS_SEPARATOR +
                getRandomInRange() + CARD_NUMBER_PARTS_SEPARATOR +
                getRandomInRange() + CARD_NUMBER_PARTS_SEPARATOR +
                getRandomInRange();
    }

    private static int getRandomInRange() {
        int minInclusive = 1000;
        int maxInclusive = 9999;
        final var splittableRandom = new SplittableRandom();
        return splittableRandom.nextInt(minInclusive, maxInclusive + 1);
    }
}
