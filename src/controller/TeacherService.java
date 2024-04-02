package controller;

import model.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с преподавателями системы
 */
public class TeacherService {
    private List<Teacher> teachers = new ArrayList<>(){{
        add(new Teacher("Александр ", "Васильевич", 101));
        add(new Teacher("Василий ", "Николаевич", 102));
        add(new Teacher("Герман ", "Михайлович", 103));
    }};

    public Teacher getRandomTeacher() {
        return teachers.get((int) (Math.random() * teachers.size()));
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
