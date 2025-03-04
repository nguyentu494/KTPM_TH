public class NoPattern {
    private Position position;

    public NoPattern(Position position) {
        this.position = position;
    }

    public void printTasks() {
        System.out.print("Simple Approach - Position: " + position + " => Tasks: ");
        switch (position) {
            case DIRECTOR:
                System.out.println("Oversee company operations");
                break;
            case DEPUTY_DIRECTOR:
                System.out.println("Manage in absence of Director");
                break;
            case ACCOUNTANT:
                System.out.println("Calculate company funds, deposit money");
                break;
            case EMPLOYEE:
                System.out.println("Make tea, park vehicles");
                break;
        }
    }
}
