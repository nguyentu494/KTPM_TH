package TH11_3.Composite;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop implements CafeComponent {
    private List<CafeComponent> tables = new ArrayList<>();

    // Thêm bàn vào quán
    public void add(CafeComponent component) {
        tables.add(component);
    }

    // Xóa bàn khỏi quán
    public void remove(CafeComponent component) {
        tables.remove(component);
    }

    @Override
    public double getCost() {
        double total = 0;
        for (CafeComponent table : tables) {
            total += table.getCost();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Doanh thu quán cà phê: " + getCost();
    }
}