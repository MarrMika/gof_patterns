package behavioural.state;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doActionContext(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doActionContext(context);
        System.out.println(context.getState().toString());
    }
}
