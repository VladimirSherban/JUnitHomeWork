package com.example.junithomework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private final String CORRECT_LOGIN = "Vladimir1994";
    private final String CORRECT_EMAIL = "VladimirRu@mail.ru";
    private final String INCORRECT_EMAIL = "VladimirRu";
    private final String EQUALS_LOGIN = "VladimirRu123@mail.ru";
    private final String EQUALS_EMAIL = "VladimirRu123@mail.ru";


    @Test
    public void shouldSetParametersWhenCreating() {
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertEquals(CORRECT_EMAIL, user.getEmail());
        assertEquals(CORRECT_LOGIN, user.getLogin());
    }

    @Test
    public void shouldCreateWithoutParameters() {
        User user = new User();
        assertNull(user.getLogin());
        assertNull(user.getEmail());
    }

    @Test
    public void shouldSetCorrectEmail() throws IllegalArgumentException {

        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> new User(CORRECT_LOGIN, INCORRECT_EMAIL));
        assertNotNull(thrown.getMessage());
    }

    @Test
    public void parametersShouldNotBeEqual() throws IllegalArgumentException {

        Throwable thrown = assertThrows(IllegalArgumentException.class, () -> new User(EQUALS_LOGIN, EQUALS_EMAIL));
        assertNotNull(thrown.getMessage());
    }
}
