package pl.comarch.it.akademia.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Optional<Car> carBox = findCar("KR11sdf");
        Car c = carBox.orElseGet(Suppliers.DEFAULT_CAR_SUPPLIER);
        Suppliers.CAR_CONSUMER_PRINT.accept(c);


        //
        //
        //
        //

        Optional<Car> carBox2 = findCar("KR11sdf");
        //carBox2.ifPresent(Suppliers.CAR_CONSUMER_PRINT);
        carBox2.ifPresentOrElse(Suppliers.CAR_CONSUMER_PRINT, () -> {
            Car car2 = new Car("asdf","asdfdfdfd","KR2342");
            System.out.println(car2.getBrand());
            System.out.println(car2.getModel());
            System.out.println(car2.getPlate());
        });

        Optional<Integer> box = Optional.empty();
        //int i = box.orElseThrow(() -> new ArithmeticException());

        ///

        Optional<Integer> box2 = Optional.empty();
        //int i2 = box2.orElseThrow(() -> new IllegalArgumentException());


        final int zmienna = 5;
        Function<Integer, Integer> function = x -> x * zmienna;

        System.out.println(function.apply(5));
        //zmienna = 7;
        System.out.println(function.apply(5));

        BiFunction<Integer, Integer, Integer> biFunction = (x,y) -> x*y;
    }

    public static Optional<Car> findCar(String plate) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", "KR11"));
        cars.add(new Car("Audi", "A5", "KR22"));
        cars.add(new Car("Toyota", "Corolla", "KR33"));
        cars.add(new Car("Kia", "Ceed", "KR44"));
        cars.add(new Car("Mazda", "5", "KR55"));

        return cars.stream()
                .filter(car -> car.getPlate().equals(plate))
                .findFirst();
    }
}
