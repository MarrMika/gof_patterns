package behavioural.strategy.commonStrategy;

public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
