package com.epam.learn.jmp.service.api;

import com.epam.learn.jmp.dto.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.mockito.Mockito.spy;

@ExtendWith(MockitoExtension.class)
@DisplayName("SubscriptionServiceApi tests.")
class SubscriptionServiceApiTest {

    @Test
    @DisplayName("All users ages present and average age calculated correctly.")
    void allUsersAgesIsCorrect() {
        final SubscriptionServiceApi serviceApi = spy(SubscriptionServiceApi.class);
        final var user1 = new User("Keanu", "Reeves", LocalDate.now().minusYears(59));
        final var user2 = new User("Jackie", "Chan", LocalDate.now().minusYears(69));
        final var user3 = new User("Arnold", "Schwarzenegger", LocalDate.now().minusYears(76));
        final var list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Mockito.when(serviceApi.getAllUsers()).thenReturn(list);
        final var averageUsersAge = serviceApi.getAverageUsersAge();
        Assertions.assertEquals(68.0, averageUsersAge);
    }

    @Test
    @DisplayName("Fail if one of users birthdays is null.")
    void failIfOneOfUsersBirthdayIsNull() {
        final SubscriptionServiceApi serviceApi = spy(SubscriptionServiceApi.class);
        final var user1 = new User("Keanu", "Reeves", LocalDate.now().minusYears(59));
        final var user2 = new User("Jackie", "Chan", null);
        final var user3 = new User("Arnold", "Schwarzenegger", LocalDate.now().minusYears(76));
        final var list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        Mockito.when(serviceApi.getAllUsers()).thenReturn(list);
        final var actualException = Assertions.assertThrows(NullPointerException.class, serviceApi::getAverageUsersAge);
        Assertions.assertEquals(NullPointerException.class, actualException.getClass());
    }

    @Test
    @DisplayName("Users list is empty.")
    void usersListIsEmpty() {
        final SubscriptionServiceApi serviceApi = spy(SubscriptionServiceApi.class);
        final var list = new ArrayList<User>();
        Mockito.when(serviceApi.getAllUsers()).thenReturn(list);
        final var averageUsersAge = serviceApi.getAverageUsersAge();
        Assertions.assertEquals(Double.NaN, averageUsersAge);
    }

    @Test
    @DisplayName("User reached payable age.")
    void userReachedPayableAge() {
        final var user = new User("Keanu", "Reeves", LocalDate.now().minusYears(59));
        Assertions.assertTrue(SubscriptionServiceApi.isPayableUser(user));
    }

    @Test
    @DisplayName("User doesn't reached payable age.")
    void userDoesNonReachedPayableAge() {
        final var user = new User("Keanu", "Reeves", LocalDate.now().minusYears(18));
        Assertions.assertFalse(SubscriptionServiceApi.isPayableUser(user));
    }
}