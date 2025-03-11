package TH4_3.State;

public class EmployeeStateContext {
    private TaskState state;

    public EmployeeStateContext(TaskState state) {
        this.state = state;
    }

    public void setState(TaskState state) {
        this.state = state;
    }

    public void printTasks() {
        System.out.print("TH4_3.State Pattern Approach => Tasks: ");
        state.printTasks();
    }
}
