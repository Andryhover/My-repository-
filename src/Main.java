import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Александр ", "Васильевич", 101));
        teachers.add(new Teacher("Василий ", "Николаевич", 102));
        teachers.add(new Teacher("Герман ", "Михайлович", 103));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Михаил", "Николаевич", teachers.get((int) (Math.random() * teachers.size())), 121));
        students.add(new Student("Антон", "Евгеньевич", teachers.get((int) (Math.random() * teachers.size())), 122));
        students.add(new Student("Пётр", "Андреевич", teachers.get((int) (Math.random() * teachers.size())), 123));
        students.add(new Student("Павел", "Анатольевич", teachers.get((int) (Math.random() * teachers.size())), 124));
        students.add(new Student("Сергей", "Васильевич", teachers.get((int) (Math.random() * teachers.size())), 125));
        students.add(new Student("Григорий", "Максимович", teachers.get((int) (Math.random() * teachers.size())), 126));

        Admin admin = new Admin("Дмитрий", "Геннадьевич", 200);
        List<Question> javaQuestion = new ArrayList<>();
        javaQuestion.add(new Question(
                "Что из следующего НЕВЕРНО в отношении массивов в Java?",
                "Массив java всегда является объектом",
                "Длина массива может быть изменена после создания массива",
                "Массивы в Java всегда размещаются в куче",
                "Ничего из перечисленного",
                2));
        javaQuestion.add(new Question(
                "Для чего используется ключевое слово final в Java?",
                "Когда класс становится окончательным, его подкласс создать невозможно",
                "Когда метод является окончательным, его нельзя переопределить",
                "Когда переменная является окончательной, ей можно присвоить значение только один раз",
                "Всё вышеперечисленное",
                4));
        javaQuestion.add(new Question(
                "Что из следующего верно в отношении наследования в Java?",
                "В Java все классы наследуются от класса Object прямо или косвенно.Класс Object является корневым для всех классов",
                "Множественное наследование в Java запрещено",
                "В отличие от C ++, в Java нет ничего похожего на тип наследования, где мы могли бы указать, является ли наследование защищенным, общедоступным или частным",
                "Всё вышеперечисленное",
                4));
        Test test = new Test("Java", javaQuestion);
        List<Question> sqlQuestions = new ArrayList<>();
        sqlQuestions.add(new Question(
                "Для создания новой таблицы в существующей базе данных используют команду:",
                "NEW TABLE",
                "CREATE TABLE",
                "MAKE TABLE",
                "Ничего из перечисленного",
                2));
        sqlQuestions.add(new Question(
                "Как расшифровывается SQL?",
                "structured query language?",
                "strict question line",
                "strong question language",
                "Ничего из перечисленного",
                1));
        sqlQuestions.add(new Question(
                "Для подсчета количества записей в таблице «Persons» используется команда:",
                "COUNT ROW IN Persons",
                "SELECT COUNT(*) FROM Persons",
                "SELECT ROWS FROM Persons",
                "Ничего из перечисленного",
                2));
        Test test1 = new Test("SQL", sqlQuestions);
        List<Question> cQuestions = new ArrayList<>();
        cQuestions.add(new Question(
                "Класс - это:",
                "любой тип данных, определяемый пользователем",
                "тип данных, определяемый пользователем и сочетающий в себе данные и функции их обработки",
                "структура, для которой в программе имеются функции работы с нею",
                "Ничего из перечисленного",
                2));
        cQuestions.add(new Question(
                "Членами класса могут быть:",
                " как переменные, так и функции, могут быть объявлены как private и как public",
                "только переменные, объявленные как private",
                "только функции, объявленные как private",
                "только переменные и функции, объявленные как private",
                1));
        cQuestions.add(new Question(
                "Объект - это:",
                "переменная, содержащая указатель на класс",
                "экземпляр класса",
                "класс, который содержит в себе данные и методы их обработки",
                "Ничего из перечисленного",
                2));
        Test test2 = new Test("С++", cQuestions);

        List<Test> tests = new ArrayList<>();
        tests.add(test);
        tests.add(test1);
        tests.add(test2);

        boolean exit = false;
        System.out.println("Вход в систему 'distant - testing v0.1 beta'");
        do {
            System.out.println("=======================================================");
            System.out.println("ГЛАВНОЕ МЕНЮ");
            System.out.println("Выберите свою роль\n1)Администратор \n2)Преподаватель \n3)Студент \nВведите номер своей роли:");
            Scanner n = new Scanner(System.in);
            if (n.hasNextInt()) {   // проверяет на инт.
                int roleNumber = n.nextInt();

                if (roleNumber == 1) {
                    System.out.println("Вы вошли с ролью Администратор, введите пин код учётной записи");
                    Scanner s = new Scanner(System.in);
                    int rolePinCode = s.nextInt();
                    if (rolePinCode == admin.getPinCode()) {
                        System.out.println(admin.getName() + admin.getSurname() + "'Добро пожаловать в меню 'Администратор'");
                        exit = true;
                    }
                }

                if (roleNumber == 2) {
                    System.out.println("Вы вошли с ролью Преподаватель, введите пин код учётной записи");
                    Scanner s = new Scanner(System.in);
                    int rolePinCode = s.nextInt();
                    for (Teacher teacher : teachers) {
                        if (rolePinCode == teacher.getPinCode()) {
                            System.out.println(teacher.getName() + teacher.getSurname() + "! Добро пожаловать в меню 'Преподаватель' \n0)Для выхода\n1)Для просмотра прикреплённых к вам студентов");
                            s = new Scanner(System.in);
                            int menuPoint = s.nextInt();
                            if (menuPoint == 1){
                                System.out.println("Ваши ученики:");
                                for (Student student: students){
                                    if (Objects.equals(teacher.getName(), student.getTeacher().getName()) &&
                                            Objects.equals(teacher.getSurname(), student.getTeacher().getSurname())){
                                        System.out.println(student.getName() +" "+ student.getSurname());
                                    }
                                }
                            }
                            if(menuPoint == 0){
                                exit = true;
                            }
                        }
                    }
                }

                if (roleNumber == 3) {
                    System.out.println("Вы вошли с ролью Студент, введите пин код учётной записи");
                    Scanner s = new Scanner(System.in);
                    int rolePinCode = s.nextInt();
                    for (Student student: students){
                        if (rolePinCode == student.getPinCode()) {
                            System.out.println(student.getName() + student.getSurname() + "'Добро пожаловать в меню 'Студент'\n0)Для выхода\n1)Посмотреть моего преподавателя \n2)Посмотреть доступные тесты");
                            s = new Scanner(System.in);
                            int menuPoint = s.nextInt();
                            if (menuPoint == 1){
                                System.out.println("Ваш преподаватель:\n" + student.getTeacher().getName() + student.getTeacher().getSurname());
                            }
                            if (menuPoint == 2){
                                for (int i = 0; i < tests.size(); i++) {
                                    System.out.println(i+1 + ") " + tests.get(i).getNameTest());
                                }
                            }
                            if(menuPoint == 0){
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





