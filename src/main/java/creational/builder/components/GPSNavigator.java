package creational.builder.components;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "78b, Schevchenko Street, Ivano-Frankivsk, Ukraine";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
