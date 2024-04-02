package controller;

import model.Question;
import model.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с тэстами системы
 */
public class TestService {
    private List<Question> javaQuestions = new ArrayList<>() {{
        add(new Question(
                "Что из следующего НЕВЕРНО в отношении массивов в Java?",
                "Массив java всегда является объектом",
                "Длина массива может быть изменена после создания массива",
                "Массивы в Java всегда размещаются в куче",
                "Ничего из перечисленного",
                2));
        add(new Question(
                "Для чего используется ключевое слово final в Java?",
                "Когда класс становится окончательным, его подкласс создать невозможно",
                "Когда метод является окончательным, его нельзя переопределить",
                "Когда переменная является окончательной, ей можно присвоить значение только один раз",
                "Всё вышеперечисленное",
                4));
        add(new Question(
                "Что из следующего верно в отношении наследования в Java?",
                "В Java все классы наследуются от класса Object прямо или косвенно.Класс Object является корневым для всех классов",
                "Множественное наследование в Java запрещено",
                "В отличие от C ++, в Java нет ничего похожего на тип наследования, где мы могли бы указать, является ли наследование защищенным, общедоступным или частным",
                "Всё вышеперечисленное",
                4));
    }};

    private List<Question> sqlQuestions = new ArrayList<>() {{
        add(new Question(
                "Для создания новой таблицы в существующей базе данных используют команду:",
                "NEW TABLE",
                "CREATE TABLE",
                "MAKE TABLE",
                "Ничего из перечисленного",
                2));
        add(new Question(
                "Как расшифровывается SQL?",
                "structured query language?",
                "strict question line",
                "strong question language",
                "Ничего из перечисленного",
                1));
        add(new Question(
                "Для подсчета количества записей в таблице «Persons» используется команда:",
                "COUNT ROW IN Persons",
                "SELECT COUNT(*) FROM Persons",
                "SELECT ROWS FROM Persons",
                "Ничего из перечисленного",
                2));
    }};

    private List<Question> cQuestions = new ArrayList<>() {{
        add(new Question(
                "Класс - это:",
                "любой тип данных, определяемый пользователем",
                "тип данных, определяемый пользователем и сочетающий в себе данные и функции их обработки",
                "структура, для которой в программе имеются функции работы с нею",
                "Ничего из перечисленного",
                2));
        add(new Question(
                "Членами класса могут быть:",
                " как переменные, так и функции, могут быть объявлены как private и как public",
                "только переменные, объявленные как private",
                "только функции, объявленные как private",
                "только переменные и функции, объявленные как private",
                1));
        add(new Question(
                "Объект - это:",
                "переменная, содержащая указатель на класс",
                "экземпляр класса",
                "класс, который содержит в себе данные и методы их обработки",
                "Ничего из перечисленного",
                2));
    }};

    private List<Test> tests = new ArrayList<>() {{
        add(new Test("SQL", sqlQuestions));
        add(new Test("С++", cQuestions));
        add(new Test("Java", javaQuestions));
    }};

    public List<Test> getTests() {
        return tests;
    }
}

