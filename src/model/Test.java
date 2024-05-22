package model;

import java.util.List;

/**
 * Тэст системы
 */
public class Test {
    private String nameTest;
    private List<Question> questions;
    public Test(String nameTest, List<Question> questions) {
        this.nameTest = nameTest;
        this.questions = questions;

    }

    public String getNameTest() {
        return nameTest;
    }

    public List<Question> getQuestions() {
        return questions;
    }
}
