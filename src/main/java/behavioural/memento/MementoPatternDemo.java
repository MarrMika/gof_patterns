package behavioural.memento;

public class MementoPatternDemo {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        originator.setState("state-1");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("state-2");
        careTaker.addMemento(originator.saveStateToMemento());

        originator.setState("current-state-3");
        System.out.println("Current state: " + originator.getState());

        //managing of previous states
        originator.getStateFromMemento(careTaker.getMemento(0));
        System.out.println("The first state: " + originator.getState());
        originator.getStateFromMemento(careTaker.getMemento(1));
        System.out.println("The second state: " + originator.getState());
    }
}
