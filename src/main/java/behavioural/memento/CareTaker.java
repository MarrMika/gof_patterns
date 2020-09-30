package behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementos = new ArrayList<>();

    public Memento getMemento(int index) {
        return mementos.get(index);
    }

    public void addMemento(Memento memento) {
        this.mementos.add(memento);
    }
}
