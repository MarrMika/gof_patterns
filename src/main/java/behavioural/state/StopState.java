package behavioural.state;

public class StopState implements State{
    @Override
    public void doActionContext(Context context) {
        System.out.println("The player is in a stop state!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
