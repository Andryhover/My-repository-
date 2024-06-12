package controller;

import model.test.Answer;

import java.util.ArrayList;
import java.util.List;

public class AnswerController {
    private List<Answer> answers = new ArrayList<>();

    public Answer addAnswer(String answerName, boolean correct) {
        Long nextId = getNextId();
        Answer answer = new Answer(nextId, answerName, correct);
        answers.add(answer);
        return answer;
    }
    private Long getNextId() {
        Long max = 0L;
        int n = answers.size();
        for (int i = 0; i < n; i++) {
            if (answers.get(i).getId() > max) {
                max = answers.get(i).getId();
            }
        }
        return max + 1L;
    }
}
