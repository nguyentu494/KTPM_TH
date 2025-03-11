package TH4_3.Strategy;

public class EmployeeStrategyContext {
    private TaskStrategy strategy;

    public EmployeeStrategyContext(TaskStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TaskStrategy strategy) {
        this.strategy = strategy;
    }

    public void printTasks() {
        System.out.print("TH4_3.Strategy Pattern Approach => Tasks: ");
        strategy.printTasks();
    }
}
