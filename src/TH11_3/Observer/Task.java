package TH11_3.Observer;

import java.util.ArrayList;
import java.util.List;

public class Task implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String status;

    public void setStatus(String status) {
        this.status = status;
        notifyObservers("Trạng thái công việc thay đổi");
    }

    public String getStatus() {
        return status;
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
            observer.update("Trạng thái công việc thay đổi: " + status + " - " + message);
        }
    }
}
