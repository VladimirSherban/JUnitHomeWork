package com.example.junithomework;

import java.util.Objects;

public class User {

    private String login;
    private String email;

    public User() {
    }

    public User(String login, String email) {
        setLogin(login);
        setEmail(email);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        if (Objects.equals(login, email)) {
            throw new IllegalArgumentException();
        }
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.replace("@", "").equals(login)) {
            throw new IllegalArgumentException("Логин и пароль не могу быть одинаковыми");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("email должен содержать '@'");
        }
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

