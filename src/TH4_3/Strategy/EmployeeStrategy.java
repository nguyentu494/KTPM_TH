package TH4_3.Strategy;

public class EmployeeStrategy implements TaskStrategy {
    @Override
    public void printTasks() {
        System.out.println("Make tea, park vehicles");
    }
}
