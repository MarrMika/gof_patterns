package serviceLocator;

public class Service1 implements Service{
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Service-1 is executing!");
    }
}
