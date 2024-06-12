package model.test;

import java.util.List;

/**
 * Тэст системы
 */
public class Test {
    private Long id;
    private String nameTest;
    private List<Question> questions;
    public Long getId() {
        return id;
    }
    public Long setId() {
        return id;
    }
    public Test(Long id, String nameTest, List<Question> questions) {
        this.id = id;
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
