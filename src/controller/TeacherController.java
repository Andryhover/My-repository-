package controller;

import model.user.Role;
import model.user.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с преподавателями системы
 */
public class TeacherController {
    private List<Teacher> teachers = new ArrayList<>() {{
        add(new Teacher(2L,"Александр ", "Васильевич", 101));
        add(new Teacher(3L,"Василий ", "Николаевич", 102));
        add(new Teacher(4L,"Герман ", "Михайлович", 103));
    }};

    public Teacher addTeahcer(Long id, String name, String surname, Role role, Integer pinCode) {
        Long nextId = getNextId();
        Teacher newTeacher = new Teacher(nextId, name, surname, pinCode);
        teachers.add(newTeacher);
        return newTeacher;
    }

    private Long getNextId() {
        Long max = 0L;
        int n = teachers.size();
        for (int i = 0; i < n; i++) {
            if (teachers.get(i).getId() > max) {
                max = teachers.get(i).getId();
            }
        }
        return max + 1L;
    }

    public Teacher getRandomTeacher() {
        return teachers.get((int) (Math.random() * teachers.size()));
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}
