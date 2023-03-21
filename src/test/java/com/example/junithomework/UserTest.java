package com.example.junithomework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private final String CORRECT_LOGIN = "Vladimir1994";
    private final String CORRECT_EMAIL = "@VladimirRu";
    private final String INCORRECT_EMAIL = "VladimirRu";
    private User out;

    @Test
    public void shouldSetParametersWhenCreating() {
        User user = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertEquals(user, out = new User("Vladimir1994", "@VladimirRu"));
    }

    @Test
    public void shouldCreateWithoutParameters() {
        User user = new User();
        assertEquals(user, out = new User());
    }

    @Test
    public void shouldSetCorrectEmail() {
        out = new User();
        out.setEmail(CORRECT_EMAIL);
        assertTrue(out.getEmail().contains("@"));
    }

    @Test
    public void parametersShouldNotBeEqual() {
        out = new User(CORRECT_LOGIN, CORRECT_EMAIL);
        assertNotEquals(out.getEmail(), out.getLogin());
    }

}