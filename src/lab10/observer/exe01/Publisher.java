package lab10.observer.exe01;

import java.util.LinkedList;
import java.util.List;

public class Publisher {
    private List<Subscriber> subscribers;
    private int mainState;

    public Publisher() {
        subscribers = new LinkedList<>();
        mainState = 0;
    }

    public boolean subscriber(Subscriber subscriber) {
        return subscribers.add(subscriber);
    }

    public boolean unsubscribe(Subscriber subscriber) {
        return subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(mainState);
        }
    }

    public void mainBusinessLogic(int state) {
        this.mainState = state;
        this.notifySubscribers();
    }
}
