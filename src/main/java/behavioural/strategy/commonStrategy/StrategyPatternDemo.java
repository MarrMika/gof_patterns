package behavioural.strategy.commonStrategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("Add strategy 20+50: " + context.executeStrategy(20, 50));

        context = new Context(new OperationMultiply());
        System.out.println("Multiply strategy 20*50: " + context.executeStrategy(20, 50));

        context = new Context(new OperationSubtract());
        System.out.println("Subtract strategy 20-50: " + context.executeStrategy(20, 50));
    }
}
