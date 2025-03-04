import Decorator.BaseTask;
import Decorator.DirectorDecorator;
import Decorator.Task;
import State.DirectorState;
import State.EmployeeStateContext;
import Strategy.EmployeeStrategy;
import Strategy.EmployeeStrategyContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Employee Tasks Examples in Different Approaches ===");

        // Approach 1: Simple switch-case (không sử dụng design pattern)
        System.out.println("\n-- Approach 1: No pattern");
        NoPattern employeeSimple = new NoPattern(Position.ACCOUNTANT);
        employeeSimple.printTasks();

        // Approach 2: State Pattern
        System.out.println("\n-- Approach 2: State Pattern");
        EmployeeStateContext employeeStateContext = new EmployeeStateContext(new DirectorState());
        employeeStateContext.printTasks();

        // Approach 3: Decorator Pattern
        System.out.println("\n-- Approach 3: Decorator Pattern");
        Task baseTask = new BaseTask();
        // Ví dụ: sử dụng AccountantDecorator cho chức vụ Kế Toán
        Task directorTask = new DirectorDecorator(baseTask);
        System.out.println("Decorator Pattern Approach => Tasks: " + directorTask.getTaskDescription());

        // Approach 4: Strategy Pattern
        System.out.println("\n-- Approach 4: Strategy Pattern");
        EmployeeStrategyContext employeeStrategyContext = new EmployeeStrategyContext(new EmployeeStrategy());
        employeeStrategyContext.printTasks();
    }
}