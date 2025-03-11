package TH11_3.Observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private double price;

    public void setPrice(double price) {
        this.price = price;
        notifyObservers("Giá cổ phiếu đã thay đổi!");
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update("Giá cổ phiếu thay đổi: " + price + " - " + message);
        }
    }
}
