package model.user;

/**
 * Студент системы
 */
public class Student extends User {
    private Teacher teacher;

    public Student(Long id, String name, String surname, Teacher teacher, Integer pinCode) {
        super(id, name, surname, Role.STUDENT, pinCode);
        this.teacher = teacher;
    }

    public Teacher getTeacher () {
        return teacher;
    }
}
