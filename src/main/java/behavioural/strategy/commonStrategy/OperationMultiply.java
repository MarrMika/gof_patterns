package behavioural.strategy.commonStrategy;

public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int a, int b) {
        return a * b;
    }
}