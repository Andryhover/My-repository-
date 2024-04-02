package model;

import model.Role;

public abstract class User {
    private String name;
    private String surname;
    private Role role;
    private int pinCode;

    public User(String name, String surname, Role role, Integer pinCode) {
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.pinCode = pinCode;
    }

    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public Role getRole() {
        return this.role;
    }
    public int getPinCode() {
        return this.pinCode;
    }

    @Override
    public String toString() {
        return "model.User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", role=" + role +
                '}';
    }
}
