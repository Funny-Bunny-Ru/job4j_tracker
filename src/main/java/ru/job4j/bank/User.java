package ru.job4j.bank;

import java.util.Objects;

/**
 * class is a model of User
 * @author dmitrij
 * @version 1.0
 */
public class User {
    /**
     * field passport contains of User's passport number
     * field username contains of User's name
     */
    private String passport;
    private String username;

    /**
     * User's model constructor
     * @param passport accepts passports number to create User
     * @param username accepts name to create User
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
