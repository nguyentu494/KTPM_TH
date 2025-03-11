package TH4_3.Decorator;

public class BaseTask implements Task {
    @Override
    public String getTaskDescription() {
        return "Who am I?";
    }
}