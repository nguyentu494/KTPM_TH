package TH11_3.Composite;

public class Product implements CafeComponent {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + " (" + cost + ")";
    }
}
