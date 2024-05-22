package controller;

import model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы со студентами системы
 */
public class StudentController {
    private TeacherController teacherController = new TeacherController();
    private List<Student> students = new ArrayList<>() {{
        add(new Student("Михаил", "Николаевич", teacherController.getRandomTeacher(), 121));
        add(new Student("Антон", "Евгеньевич", teacherController.getRandomTeacher(), 122));
        add(new Student("Пётр", "Андреевич", teacherController.getRandomTeacher(), 123));
        add(new Student("Павел", "Анатольевич", teacherController.getRandomTeacher(), 124));
        add(new Student("Сергей", "Васильевич", teacherController.getRandomTeacher(), 125));
        add(new Student("Григорий", "Максимович", teacherController.getRandomTeacher(), 126));
    }};

    public List<Student> getStudents() {
        return students;
    }
}
