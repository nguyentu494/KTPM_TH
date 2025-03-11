package TH11_3.Composite;

import java.util.ArrayList;
import java.util.List;

public class Table implements CafeComponent {
    private int tableNo;
    private List<CafeComponent> products = new ArrayList<>();

    public Table(int tableNo) {
        this.tableNo = tableNo;
    }

    // Phương thức thêm thành phần (sản phẩm) vào bàn
    public void add(CafeComponent component) {
        products.add(component);
    }

    // Phương thức xóa thành phần khỏi bàn
    public void remove(CafeComponent component) {
        products.remove(component);
    }

    @Override
    public double getCost() {
        double total = 0;
        for (CafeComponent p : products) {
            total += p.getCost();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Bàn " + tableNo + " có tổng tiền: " + getCost();
    }
}