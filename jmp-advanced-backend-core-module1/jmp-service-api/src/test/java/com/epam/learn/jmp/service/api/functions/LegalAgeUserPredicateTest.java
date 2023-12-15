package com.epam.learn.jmp.service.api.functions;

import com.epam.learn.jmp.dto.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

@DisplayName("LegalAgeUserPredicate tests.")
class LegalAgeUserPredicateTest {

    private final LegalAgeUserPredicate legalAgeUserPredicate = new LegalAgeUserPredicate();

    @Test
    @DisplayName("user is reached legal age.")
    void userReachedLegalAge() {
        final var birthday = LocalDate.now().minusYears(19);
        final var user = new User("Elvis", "Presley", birthday);
        Assertions.assertTrue(legalAgeUserPredicate.test(user));
    }

    @Test
    @DisplayName("user is not reached legal age.")
    void userIsNotReachedLegalAge() {
        final var birthday = LocalDate.now().minusYears(17);
        final var user = new User("Bruce", "Lee", birthday);
        Assertions.assertFalse(legalAgeUserPredicate.test(user));
    }

    @Test
    @DisplayName("user birthday is null.")
    void userBirthdayIsNull() {
        final var user = new User("Tom", "Hanks", null);
        Assertions.assertFalse(legalAgeUserPredicate.test(user));
    }

    @Test
    @DisplayName("user is null.")
    void userIsNull() {
        Assertions.assertFalse(legalAgeUserPredicate.test(null));
    }
}