package com.epam.learn.jmp.dto;

import java.time.LocalDate;

public record Subscription(String bankcard, LocalDate startDate) {
}
