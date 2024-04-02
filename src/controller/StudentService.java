package controller;

import model.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы со студентами системы
 */
public class StudentService {
    private TeacherService teacherService = new TeacherService();
    private List<Student> students = new ArrayList<>() {{
        add(new Student("Михаил", "Николаевич", teacherService.getRandomTeacher(), 121));
        add(new Student("Антон", "Евгеньевич", teacherService.getRandomTeacher(), 122));
        add(new Student("Пётр", "Андреевич", teacherService.getRandomTeacher(), 123));
        add(new Student("Павел", "Анатольевич", teacherService.getRandomTeacher(), 124));
        add(new Student("Сергей", "Васильевич", teacherService.getRandomTeacher(), 125));
        add(new Student("Григорий", "Максимович", teacherService.getRandomTeacher(), 126));
    }};

    public List<Student> getStudents() {
        return students;
    }
}
