package behavioural.strategy.enumStrategy;

public class EnumStrategyDemo {
    public static void main(String[] args) {
        System.out.println("Add: " + Math.ADD.execute(3, 5));
        System.out.println("Subtract: " + Math.SUBTRACT.execute(3, 5));
        System.out.println("Multiply: " + Math.MULTIPLY.execute(3, 5));
    }
}
