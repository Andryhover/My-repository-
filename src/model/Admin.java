package model;

/**
 * Администратор системы
 */
public class Admin extends User {

    public Admin(String name, String surname, Integer pinCode) {
        super(name, surname, Role.ADMIN, pinCode);
    }
}

