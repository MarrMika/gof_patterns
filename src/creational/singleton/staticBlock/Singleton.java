package creational.singleton.staticBlock;

public class Singleton {
    private static Singleton singleton;

    private Singleton(){}

    static {
        try{
            singleton = new Singleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }

    }

    private static Singleton getInstance(){
        return singleton;
    }
}
