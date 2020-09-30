package behavioural.mediator;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        User mar = new User("MarrMika");
        User alex = new User("Alex");

        mar.sendMessage("Hello, Alex! How are you doing?");
        alex.sendMessage("Hi, happy to hear you! I'm great! And you?");
    }
}
