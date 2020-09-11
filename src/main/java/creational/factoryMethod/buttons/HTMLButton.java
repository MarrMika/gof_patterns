package creational.factoryMethod.buttons;

public class HTMLButton implements Button {
    @Override
    public void display() {
        System.out.println("<button>I am button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("You've clicked me. Hello, my dear friend!");
    }
}
