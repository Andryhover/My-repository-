package model.user;

/**
 * Администратор системы
 */
public class Admin extends User {

    public Admin(Long id, String name, String surname, Integer pinCode) {
        super(id, name, surname, Role.ADMIN, pinCode);
    }
}

