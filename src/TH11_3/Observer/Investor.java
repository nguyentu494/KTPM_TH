package TH11_3.Observer;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Nhà đầu tư " + name + " nhận thông báo: " + message);
    }
}
