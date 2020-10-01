package behavioural.templateMethod;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Initialize Football!");
    }

    @Override
    void start() {
        System.out.println("Start Football!");
    }

    @Override
    void end() {
        System.out.println("End Football!");
    }
}
