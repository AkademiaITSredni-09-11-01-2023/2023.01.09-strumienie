package pl.comarch.it.akademia.enumy;

import pl.comarch.it.akademia.zadanie.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Console console = Console.XBOX_ONE;

        System.out.println(console.getBrand());
        System.out.println(console.getModel());
        System.out.println(console.getPrice());

        console.setPrice(300.00);

        //Console console2 = new Console("Marka", "Model", 345.54);

        Console console2 = Console.PS5;
        System.out.println(console2.getBrand());
        System.out.println(console2.getModel());
        System.out.println(console2.getPrice());

        if(console == console2) {
            System.out.println("Oba to XBOX !!!");
        }

        List<Employee> employees = new ArrayList<>();

        for(int i = 0; i < 1000; i++) {
            Employee e = new Employee();
            employees.add(e);
        }


    }
}
