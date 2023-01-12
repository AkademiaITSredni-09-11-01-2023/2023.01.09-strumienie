package pl.comarch.it.akademia.zadanie;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Imie1", "Nazwisko1", 3500, Employee.Position.LOW));
        employeeList.add(new Employee(2, "Imie2", "Nazwisko2", 3800, Employee.Position.LOW));
        employeeList.add(new Employee(3, "Imie3", "Nazwisko3", 4100, Employee.Position.MID));
        employeeList.add(new Employee(4, "Imie4", "Nazwisko4", 4400, Employee.Position.LOW));
        employeeList.add(new Employee(5, "Imie5", "Nazwisko5", 4700, Employee.Position.MID));
        employeeList.add(new Employee(6, "Imie6", "Nazwisko6", 5000, Employee.Position.MID));
        employeeList.add(new Employee(7, "Imie7", "Nazwisko7", 5300, Employee.Position.HIGH));
        employeeList.add(new Employee(8, "Imie8", "Nazwisko8", 5600, Employee.Position.HIGH));

        employeeList.stream()
                .filter(e -> e.getPosition() == Employee.Position.MID)
                .filter(e -> e.getSalary() > 4000)
                .filter(e -> e.getSalary() < 5000)
                .peek(e -> e.setSalary(4800))
                .map(Employee::getId)
                .forEach(System.out::println);

        System.out.println("---------------");

        for(Employee employee : employeeList) {
            System.out.println(employee);
        }


        Employee employee =
                new Employee(1, "Jan", "Kowalski",
                        4000, Employee.Position.MID);

        Employee.Position position = Employee.Position.HIGH;

        Employee employee2 = new Employee();
        employee2.setPosition(Employee.Position.HIGH);
    }
}
