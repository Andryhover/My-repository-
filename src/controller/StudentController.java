package controller;

import model.user.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы со студентами системы
 */
public class StudentController {
    private TeacherController teacherController = new TeacherController();
    private List<Student> students = new ArrayList<>() {{
        add(new Student(5L,"Михаил", "Николаевич", teacherController.getRandomTeacher(), 121));
        add(new Student(6L,"Антон", "Евгеньевич", teacherController.getRandomTeacher(), 122));
        add(new Student(7L,"Пётр", "Андреевич", teacherController.getRandomTeacher(), 123));
        add(new Student(8L,"Павел", "Анатольевич", teacherController.getRandomTeacher(), 124));
        add(new Student(9L,"Сергей", "Васильевич", teacherController.getRandomTeacher(), 125));
        add(new Student(10L,"Григорий", "Максимович", teacherController.getRandomTeacher(), 126));
    }};

    public List<Student> getStudents() {
        return students;
    }
}
