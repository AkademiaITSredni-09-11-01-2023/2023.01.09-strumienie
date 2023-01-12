package pl.comarch.it.akademia.funkcyjny;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main2 {
    public static void main(String[] args) {
        String wybor = "A5";
        if(wybor.equals("A1")) {
            przeliczLepiej(Main2::algorytm1, Main2::wczytajDane);
        } else if(wybor.equals("A2")) {
            przeliczLepiej(Main2::algorytm2, Main2::wczytajDane);
        } else if(wybor.equals("A3")) {
            przeliczLepiej(Main2::algorytm3, Main2::wczytajDane2);
        } else if(wybor.equals("A5")) {
            przeliczLepiej(Main2::algorytm2, () -> {
                System.out.println("jakis niestandardowy sposob albo miejsce wczytywania");
                System.out.println("kastomowe wczytywanie");
                //??
                //??
                //??
                return 10;
            });
        } else {
            przeliczLepiej(Main2::algorytm4, Main2::wczytajDane2);
        }
    }

    public static void algorytm1(int i) {
        //cos tu sie liczy
        System.out.println("Algorytm 1");
    }

    public static void algorytm2(int i) {
        //cos tu sie liczy
        System.out.println("Algorytm 2");
    }

    public static void algorytm3(int i) {
        //cos tu sie liczy
        System.out.println("Algorytm 3");
    }

    public static void algorytm4(int i) {
        //cos tu sie liczy
        System.out.println("Algorytm 4");
    }

    public static int wczytajDane() {
        System.out.println("Wczytywanie na pierwszy sposob");
        return 0;
    }

    public static int wczytajDane2() {
        System.out.println("Wczytywanie na inny sposob");
        return 1;
    }

    /*public static void przelicz1() {
        int dane = wczytajDane();
        algorytm1(dane);
    }

    public static void przelicz2() {
        int dane = wczytajDane();
        algorytm2(dane);
    }

    public static void przelicz3() {
        int dane = wczytajDane();
        algorytm3(dane);
    }

    public static void przelicz4() {
        int dane = wczytajDane();
        algorytm4(dane);
    }*/

    public static void przeliczLepiej(Consumer<Integer> algorytmCalkujacy,
                                      Supplier<Integer> wczytywaczDanych) {
        int dane = wczytywaczDanych.get();
        algorytmCalkujacy.accept(dane);
    }
}
