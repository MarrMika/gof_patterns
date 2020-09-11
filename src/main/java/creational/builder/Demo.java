package creational.builder;

import creational.builder.builders.CarBuilder;
import creational.builder.builders.CarManualBuilder;
import creational.builder.cars.Car;
import creational.builder.cars.Manual;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructCityCar(carBuilder);

        Car car = carBuilder.getResult();
        System.out.println("Car built: " + car.getType());

        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSUV(carManualBuilder);

        Manual manual = carManualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + manual.print());


    }
}
