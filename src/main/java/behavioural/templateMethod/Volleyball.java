package behavioural.templateMethod;

public class Volleyball extends Game {
    @Override
    void initialize() {
        System.out.println("Initialize Volleyball!");
    }

    @Override
    void start() {
        System.out.println("Start Volleyball!");
    }

    @Override
    void end() {
        System.out.println("End Volleyball!");
    }
}
