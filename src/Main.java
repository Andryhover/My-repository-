import controller.AnswerController;
import controller.QuestionController;

public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.TestSystem();



        QuestionController questionController = new QuestionController();
        AnswerController answerController = new AnswerController();
    }

}
