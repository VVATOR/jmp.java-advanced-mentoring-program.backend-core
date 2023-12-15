package com.epam.learn.jmp.service.api.functions;

import com.epam.learn.jmp.dto.User;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.Predicate;

public final class LegalAgeUserPredicate implements Predicate<User> {
    private static final long PAYABLE_AGE = 18L;

    @Override
    public boolean test(User user) {
        if (Objects.isNull(user) || Objects.isNull(user.birthday())) {
            return false;
        }
        return LocalDate.now()
                .minusYears(PAYABLE_AGE)
                .isAfter(user.birthday());
    }
}