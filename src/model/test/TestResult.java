package model.test;

import model.user.Student;

/**
 * Результат тэста студента
 */
public class TestResult {
    private Long id;
    private Test test;
    private Student student;
    private int rightAnswers;
    public Long getId() {
        return id;
    }
    public Long setId() {
        return id;
    }
    public TestResult(Long id, Test test, Student student, int rightAnswers) {
        this.id = id;
        this.test = test;
        this.student = student;
        this.rightAnswers = rightAnswers;
    }
}
