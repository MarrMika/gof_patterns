package behavioural.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("The first change to 10");
        subject.setState(10);
        System.out.println("The first change to 14");
        subject.setState(14);

    }
}
