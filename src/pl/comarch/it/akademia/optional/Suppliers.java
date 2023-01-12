package pl.comarch.it.akademia.optional;

import java.util.function.Consumer;
import java.util.function.Supplier;

public interface Suppliers {
    Supplier<Car> DEFAULT_CAR_SUPPLIER = () -> new Car(
            "default",
            "default",
            "default");

    Car DEFAULT_CAR = new Car(
            "default",
            "default",
            "default");

    Consumer<Car> CAR_CONSUMER_PRINT = car -> {
        System.out.println("Brand: " + car.getBrand());
        System.out.println(car.getModel());
        System.out.println(car.getPlate());
    };

    double PI = 3.14;
}
