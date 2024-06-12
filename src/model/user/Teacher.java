package model.user;

/**
 * Преподаватель системы
 */
public class Teacher extends User {
    public Teacher(Long id, String name, String surname, Integer pinCode) {
        super(id, name, surname, Role.TEACHER, pinCode);
    }
}