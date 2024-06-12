package model.test;

public class Answer {
    private Long id;
    private String answerName;
    private boolean correct;
    public Long getId() {
        return id;
    }
    public Long setId() {
        return id;
    }
    public Answer(Long id, String answerName, Boolean correct){
        this.id = id;
        this.answerName = answerName;
        this.correct = correct;
    }

    // todo конструктор со всеми параметрами

}
