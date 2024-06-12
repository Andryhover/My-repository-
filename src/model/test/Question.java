package model.test;

import java.util.List;

/**
 * Вопрос тэста системы
 */
public class Question {
    private Long id;
    private String questionName;
    private List<Answer> answers;

    public Long getId() {
        return id;
    }
    public Long setId() {
        return id;
    }

    public Question(Long id, String questionName) {
        this.id = id;
        this.questionName = questionName;
    }

    public Question(Long id, String questionName, List<Answer> answers) {
        this.id = id;
        this.questionName = questionName;
        this.answers = answers;
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
    }
}
