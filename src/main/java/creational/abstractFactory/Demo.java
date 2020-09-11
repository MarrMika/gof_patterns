package creational.abstractFactory;

import creational.abstractFactory.factories.Factory;
import creational.abstractFactory.factories.MacOSFactory;
import creational.abstractFactory.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication(){
        Application application;
        Factory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            application = new Application(factory);
        } else {
            factory = new WindowsFactory();
            application = new Application(factory);
        }



        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.paint();


    }
}
