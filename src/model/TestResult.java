package model;

public class TestResult {
    private Test test;
    private Student student;
    private int rightAnswers;
    public TestResult (Test test,Student student,int rightAnswers) {
        this.test = test;
        this.student = student;
        this.rightAnswers=rightAnswers;
    }
}
