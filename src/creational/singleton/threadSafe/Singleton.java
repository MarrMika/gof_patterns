package creational.singleton.threadSafe;

public class Singleton {

    private static volatile Singleton instance;//atomic  is not divided
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        Singleton singleton = instance;
        if(singleton != null)
            return singleton;

        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
