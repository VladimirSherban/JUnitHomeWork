package com.example.junithomework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private final String CORRECT_LOGIN = "Vladimir1994";
    private final String CORRECT_EMAIL = "@VladimirRu";
    private final String INCORRECT_EMAIL = "VladimirRu";
    private final String EQUALS_LOGIN = "VladimirRu123";
    private final String EQUALS_EMAIL = "@VladimirRu123";


    @Test
    public void shouldSetParametersWhenCreating() {
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertEquals(user, new User(user.getLogin(), user.getEmail()));
    }

    @Test
    public void shouldCreateWithoutParameters() {
        User user = new User();
        assertEquals(user, new User());
    }

    @Test
    public void shouldSetCorrectEmail() throws IllegalArgumentException {

        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> {
            new User(CORRECT_LOGIN, INCORRECT_EMAIL);
        });
        assertNotNull(thrown.getMessage());

    }

    @Test
    public void parametersShouldNotBeEqual() throws IllegalArgumentException {

        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> {
            new User(EQUALS_LOGIN, EQUALS_EMAIL);
        });
        assertNotNull(thrown.getMessage());
    }

}