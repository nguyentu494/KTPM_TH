import TH11_3.Adapter.JsonService;
import TH11_3.Adapter.XMLService;
import TH11_3.Adapter.XmlJsonAdapter;
import TH11_3.Observer.Investor;
import TH11_3.Observer.Stock;
import TH11_3.Observer.Task;
import TH11_3.Observer.TeamMember;

public class Main {
    public static void main(String[] args) {
        Stock appleStock = new Stock();
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        appleStock.attach(investor1);
        appleStock.attach(investor2);

        System.out.println("Thay đổi giá cổ phiếu:");
        appleStock.setPrice(150.00);

        // Mô phỏng thông báo cho công việc
        Task task = new Task();
        TeamMember member1 = new TeamMember("Charlie");
        TeamMember member2 = new TeamMember("Diana");

        task.attach(member1);
        task.attach(member2);

        System.out.println("\nCập nhật trạng thái công việc:");
        task.setStatus("Đang tiến hành");
        task.setStatus("Hoàn thành");
//        Product coffee = new Product("Cà phê", 3.5);
//        Product water = new Product("Nước suối", 1.0);
//        Product milkTea = new Product("Trà sữa", 4.0);
//
//        // Tạo bàn và thêm các sản phẩm vào bàn
//        Table table1 = new Table(1);
//        table1.add(coffee);
//        table1.add(water);
//
//        Table table2 = new Table(2);
//        table2.add(milkTea);
//        table2.add(coffee);
//        table2.add(water);
//
//        // Tạo quán cà phê và thêm các bàn vào quán
//        CoffeeShop shop = new CoffeeShop();
//        shop.add(table1);
//        shop.add(table2);
//
//        // In ra tổng tiền của từng bàn
//        System.out.println(table1);
//        System.out.println(table2);
//
//        // In ra doanh thu của quán cà phê
//        System.out.println(shop);
        // Tạo đối tượng XMLService (hệ thống chỉ hỗ trợ XML)
//        XMLService xmlService = new XMLService();
//
//        // Tạo adapter để chuyển đổi giữa JSON và XML
//        JsonService adapter = new XmlJsonAdapter(xmlService);
//
//        // Dữ liệu đầu vào ở dạng JSON từ client
//        String jsonRequest = "{\"data\": \"sample\"}";
//        System.out.println("Client gửi JSON: " + jsonRequest);
//
//        // Xử lý thông qua adapter
//        String jsonResponse = adapter.processJson(jsonRequest);
//
//        System.out.println("Client nhận JSON: " + jsonResponse);
    }
}