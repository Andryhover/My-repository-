package model;

/**
 * Вопрос тэста системы
 */
public class Question {
    private String questionName;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private int rightAnswer;

    public Question(String questionName, String option1, String option2, String option3, String option4,
                    Integer rightAnswer) {
        this.questionName=questionName;
        this.option1=option1;
        this.option2=option2;
        this.option3=option3;
        this.option4=option4;
        this.rightAnswer=rightAnswer;
    }
}
