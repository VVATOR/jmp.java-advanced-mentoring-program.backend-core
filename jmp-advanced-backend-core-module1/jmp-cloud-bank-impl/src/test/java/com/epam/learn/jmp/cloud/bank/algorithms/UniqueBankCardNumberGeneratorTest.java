package com.epam.learn.jmp.cloud.bank.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

class UniqueBankCardNumberGeneratorTest {

    @Test
    @DisplayName("Bank service tests.")
    void getUniqueCardNumber() {
        final var expectedCardNumbersCount = 100;
        final Set<String> numbers = new HashSet<>();
        for (int i = 0; i < expectedCardNumbersCount; i++) {
            numbers.add(UniqueBankCardNumberGenerator.getUniqueCardNumber());
        }
        Assertions.assertEquals(expectedCardNumbersCount, numbers.size());
    }
}