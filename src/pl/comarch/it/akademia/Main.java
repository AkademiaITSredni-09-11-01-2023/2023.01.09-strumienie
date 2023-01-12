package pl.comarch.it.akademia;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        /*List<String> lista = new LinkedList<>();

        System.out.println(lista.size());

        lista.add("ABC");
        lista.add("cos");
        lista.add("cos innego");

        System.out.println(lista.size());

        lista.remove(0);

        System.out.println(lista.size());

        System.out.println(lista);

        System.out.println(lista.get(1));*/

        Set<String> set = new TreeSet<>();

        set.add("Janusz");
        set.add("Adam");
        set.add("Zbyszek");
        set.add("Karol");
        set.add("Bartek");
        set.add("Wlodek");

        System.out.println(set);
    }
}
