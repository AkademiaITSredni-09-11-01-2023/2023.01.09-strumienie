package pl.comarch.it.akademia.funkcyjny;

import pl.comarch.it.akademia.Pet;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> x = i -> "Liczba: " + i;

        String wynik = x.apply(8);
        System.out.println(wynik);

        String wynik2 = x.apply(10);
        System.out.println(wynik2);

        BiFunction<Integer, Double, Boolean> biFunction =
                (a,b) -> a*4 + b*2 > 40;

        boolean b = biFunction.apply(11, 4.0);
        System.out.println(b);

        UnaryOperator<Integer> unaryOperator = i -> i*4;
        //Function<Integer, Integer> f = i -> i*4;

        int wynik3 = unaryOperator.apply(5);
        System.out.println(wynik3);

        Predicate<String> predicate = s -> s.contains("x");
        boolean wynikTestowania = predicate.test("Mateusz");
        System.out.println(wynikTestowania);

        boolean wynikTestowania2 = predicate.test("xyz");
        System.out.println(wynikTestowania2);

        Supplier<Pet> supplier = () -> new Pet("def", 0);
        Pet p1 = supplier.get();
        Pet p2 = supplier.get();

        System.out.println(p1);
        System.out.println(p2);

        Consumer<Pet> consumer = p -> System.out.println("Poglaskalem: " + p.name);

        consumer.accept(new Pet("Reks", 10));
        consumer.accept(supplier.get());
    }

    public void m() {
        ///
    }
}
