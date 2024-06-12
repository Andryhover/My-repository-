package controller;

import model.test.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionController {

    private List<Question> questions = new ArrayList<>();
    public Question addQuestion(String questionName) {
        Long nextId = getNextId();
        Question newQuestion = new Question(nextId, questionName);
        questions.add(newQuestion);
        return newQuestion;
    }

    private Long getNextId() {
        Long max = 0L;
        int n = questions.size();
        for (int i = 0; i < n; i++) {
            if (questions.get(i).getId() > max) {
                max = questions.get(i).getId();
            }
        }
        return max + 1L;
    }
}
