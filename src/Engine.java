import controller.AdminController;
import controller.StudentController;
import controller.TeacherController;
import controller.TestController;
import model.user.Admin;
import model.user.Student;
import model.user.Teacher;
import model.test.Test;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * Основная логика системы
 */
public class Engine {
    static StudentController studentController = new StudentController();
    static TeacherController teacherController = new TeacherController();
    static AdminController adminController = new AdminController();
    static TestController testController = new TestController();

    public void TestSystem() {
        boolean exit = false;
        System.out.println("Вход в систему 'distant - testing v0.1 beta'");
        do {
            System.out.println("=======================================================");
            System.out.println("ГЛАВНОЕ МЕНЮ");
            System.out.println("Выберите свою роль\n1)Администратор \n2)Преподаватель \n3)Студент \nВведите номер своей роли:");
            Scanner n = new Scanner(System.in);
            if (n.hasNextInt()) {
                int roleNumber = n.nextInt();
                if (roleNumber == 1) {
                    System.out.println("Вы вошли с ролью Администратор, введите пин код учётной записи");
                    Scanner s = new Scanner(System.in);
                    int rolePinCode = s.nextInt();
                    for (Admin admin : adminController.getAdmins()) {
                        if (rolePinCode == admin.getPinCode()) {
                            System.out.println(admin.getName() + admin.getSurname() + "'Добро пожаловать в меню 'Администратор'");
                            exit = true;
                        }
                    }
                }
                if (roleNumber == 2) {
                    System.out.println("Вы вошли с ролью Преподаватель, введите пин код учётной записи");
                    Scanner s = new Scanner(System.in);
                    int rolePinCode = s.nextInt();
                    for (Teacher teacher : teacherController.getTeachers()) {
                        if (rolePinCode == teacher.getPinCode()) {
                            System.out.println(teacher.getName() + teacher.getSurname() + "! Добро пожаловать в меню 'Преподаватель' \n0)Для выхода\n1)Для просмотра прикреплённых к вам студентов");
                            s = new Scanner(System.in);
                            int menuPoint = s.nextInt();
                            if (menuPoint == 1) {
                                System.out.println("Ваши ученики:");
                                for (Student student: studentController.getStudents()) {
                                    if (Objects.equals(teacher.getName(), student.getTeacher().getName()) &&
                                            Objects.equals(teacher.getSurname(), student.getTeacher().getSurname())) {
                                        System.out.println(student.getName() +" "+ student.getSurname());
                                    }
                                }
                            }
                            if(menuPoint == 0) {
                                exit = true;
                            }
                        }
                    }
                }

                if (roleNumber == 3) {
                    System.out.println("Вы вошли с ролью Студент, введите пин код учётной записи");
                    Scanner s = new Scanner(System.in);
                    int rolePinCode = s.nextInt();
                    for (Student student: studentController.getStudents()) {
                        if (rolePinCode == student.getPinCode()) {
                            System.out.println(student.getName() + student.getSurname() + "'Добро пожаловать в меню 'Студент'\n0)Для выхода\n1)Посмотреть моего преподавателя \n2)Посмотреть доступные тесты");
                            s = new Scanner(System.in);
                            int menuPoint = s.nextInt();
                            if (menuPoint == 1) {
                                System.out.println("Ваш преподаватель:\n" + student.getTeacher().getName() + student.getTeacher().getSurname());
                            }
                            if (menuPoint == 2) {
                                List<Test> tests = testController.getTests();
                                for (int i = 0; i < tests.size(); i++) {
                                    System.out.println(i+1 + ") " + tests.get(i).getNameTest());
                                }
                            }
                            if(menuPoint == 0) {
                                exit = true;
                            }
                        }
                    }
                }
            } else {
                System.out.println("Введите число с корректным номером");
            }
        } while (!exit);
    }
}
