package TH11_3.Observer;

public class TeamMember implements Observer {
    private String name;

    public TeamMember(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Thành viên " + name + " nhận thông báo: " + message);
    }
}
