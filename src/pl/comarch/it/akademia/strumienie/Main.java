package pl.comarch.it.akademia.strumienie;

import pl.comarch.it.akademia.optional.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,6,4,5,6,7,8,9);

        /*List<Integer> used = new ArrayList<>();
        for(int liczba : list) {
           if(liczba > 3 && liczba < 7) {
               if(!used.contains(liczba)) {
                   used.add(liczba);
                   System.out.println("Liczba: " + liczba);
               }
           }
        }*/

        list.stream()
                .peek(System.out::println)
                .filter(x -> x > 3)
                .filter(x -> x < 7)
                .map(x -> "Liczba: " + x)
                .distinct()
                .limit(1)
                .forEach(System.out::println);

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "3", "KR11"));
        cars.add(new Car("Audi", "A5", "KR22"));
        cars.add(new Car("Toyota", "Corolla", "KR33"));
        cars.add(new Car("Kia", "Ceed", "KR44"));
        cars.add(new Car("Mazda", "5", "KR55"));

        cars.stream()
                .peek(car -> car.setModel("Jakis"))
                //.map(c -> new Car(c.getModel(), "Jakis", c.getPlate()))
                .forEach(car -> {
            System.out.println(car.getBrand());
            System.out.println(car.getModel());
            System.out.println(car.getPlate());
        });
        System.out.println("------------------------------------");
        for(Car car : cars) {
            System.out.println(car.getBrand());
            System.out.println(car.getModel());
            System.out.println(car.getPlate());
        }

        System.out.println("-------------------------------------------");
        int suma = list.stream().parallel().reduce(0, (acc, x) -> acc + x);
        System.out.println(suma);

        int sumaLiterWeWszystkichSamochodach = cars.stream()
                .mapToInt(
                        car -> car.getBrand().length() +
                                        car.getModel().length() +
                                        car.getPlate().length())
                .sum();

        System.out.println(sumaLiterWeWszystkichSamochodach);
    }
}
