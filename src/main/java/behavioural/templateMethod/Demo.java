package behavioural.templateMethod;

public class Demo {
    public static void main(String[] args) {
        Game football = new Football();
        football.play();
        System.out.println();
        Game volleyball = new Volleyball();
        volleyball.play();
    }
}
