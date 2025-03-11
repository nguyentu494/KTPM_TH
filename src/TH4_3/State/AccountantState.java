package TH4_3.State;

public class AccountantState implements TaskState {
    @Override
    public void printTasks() {
        System.out.println("Calculate company funds, deposit money");
    }
}

