package pl.comarch.it.akademia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main2 {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<>();

        list.add("Janusz");
        list.add("Karol");
        list.add("Adam");
        list.add("Zbyszek");
        list.add("Jan");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);*/

        List<Pet> pets = new ArrayList<>();

        pets.add(new Pet("Reksio", 5));
        pets.add(new Pet("Max", 10));
        pets.add(new Pet("Karol", 9));
        pets.add(new Pet("Czarek", 8));

        System.out.println(pets);

        Collections.sort(pets, Comparator.comparing(x -> x.name));

        Consumer<String> consumer = x -> System.out.println(x);
        Consumer<String> consumer2 = System.out::println;

        BiFunction<Integer, Integer, Integer> function = (x,y) -> x+y;
        BiFunction<Integer, Integer, Integer> function2 = Integer::sum;

        Comparator<Pet> comparator = (x, y) -> 4;
        System.out.println(pets);

        Collections.sort(pets, new Comparator<Pet>() {
            @Override
            public int compare(Pet o1, Pet o2) {
                return o2.age - o1.age;
            }
        });

        System.out.println(pets);

        /*Interfejs i = new Interfejs() {
            @Override
            public void a() {

            }

            @Override
            public void b() {

            }

            @Override
            public void c() {

            }
        };*/

        Interfejs i = () -> System.out.println("a");

        Abstrakcyjna a = new Abstrakcyjna() {
            @Override
            public void am() {
                System.out.println("AM !!");
            }
        };

        a.a = 345;
        a.m();
        a.am();


        Pet p = new Pet() {
            @Override
            public void szekaj() {
                System.out.println("miau miau !!");
            }
        };

        p.szekaj();


        String sortType = "AGE";
        if(sortType.equals("AGE")) {
            Collections.sort(pets, (x, y) -> x.age - y.age);
        } else if(sortType.equals("NAME")) {
            Collections.sort(pets, (x, y) -> x.name.compareTo(y.name));
        }

        Consumer<Integer> consumer1 = Main2::cos;

        //wyswietl
    }

    public static void cos(int a) {
        a+=5;
        a*=4;
        System.out.println(a);
    }
}
