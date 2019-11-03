package creational.singleton.naive;

public class DemoSingleThread {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance("1");
        Singleton s2 = Singleton.getInstance("2");
        System.out.println(s1.value);
        System.out.println(s2.value);
    }
}
