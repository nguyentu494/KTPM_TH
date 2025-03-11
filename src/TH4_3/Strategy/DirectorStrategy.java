package TH4_3.Strategy;

public class DirectorStrategy implements TaskStrategy {
    @Override
    public void printTasks() {
        System.out.println("I am the Director. I oversee company operations.");
    }
}