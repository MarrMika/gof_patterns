package behavioural.state;

public class StartState implements State {
    @Override
    public void doActionContext(Context context) {
        System.out.println("The player is in a start state!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
