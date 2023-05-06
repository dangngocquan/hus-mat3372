package lab10.observer.exe01;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Subscriber subscriber1 = new ConcreteSubscriber1();
        Subscriber subscriber2 = new ConcreteSubscriber2();

        publisher.subscriber(subscriber1);
        publisher.subscriber(subscriber2);

        publisher.mainBusinessLogic(2);
        publisher.mainBusinessLogic(5);

    }
}
