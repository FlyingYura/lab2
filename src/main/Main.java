package main;

import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введіть кількість автомобілів: ");
//        int carCount = scanner.nextInt();
//        Car[] cars = new Car[carCount];
//                for (int i = 0; i < carCount; i++) {
//                    System.out.println("Введіть дані для автомобіля №" + (i + 1));
//
//                    System.out.print("ID: ");
//                    int id = scanner.nextInt();
//
//                    scanner.nextLine();
//
//                    System.out.print("Модель: ");
//                    String model = scanner.nextLine();
//
//                    System.out.print("Рік випуску: ");
//                    int year = scanner.nextInt();
//
//                    System.out.print("Ціна: ");
//                    double price = scanner.nextDouble();
//
//                    scanner.nextLine(); // споживання нової лінії після double
//
//                    System.out.print("Реєстраційний номер: ");
//                    String registrationNumber = scanner.nextLine();
//
//                    cars[i] = new Car(id, model, year, price, registrationNumber);
//                }
         List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Toyota", 2015, 15000, "BC1234BB"));
        cars.add(new Car(2, "BMW", 2018, 25000, "BC5678CD"));
        cars.add(new Car(3, "Toyota", 2010, 10000, "BC7890EF"));
        cars.add(new Car(4, "Audi", 2020, 30000, "BC1234DD"));
        cars.add(new Car(5, "Toyota", 2019, 18000, "BC4567FG"));
        cars.add(new Car(6, "Audi", 2006, 60000, "BC1234RE"));
        cars.add(new Car(7, "BMW", 2021, 30000, "BC5678FF"));
        cars.add(new Car(8, "Porche", 2011, 17000, "BC9012AA"));
        cars.add(new Car(9, "Porche", 2006, 7000, "BC2471LA"));


        Scanner scanner = new Scanner(System.in);

        String model;
        do {
            System.out.print("Введіть модель автомобіля: ");
            model = scanner.nextLine();
            if (!isModelInList(cars, model)) {
                System.out.println("Такої моделі немає в списку. Спробуйте ще раз.");
            }
        } while (!isModelInList(cars, model));
        System.out.println("Список автомобілів моделі " + model + ":");
        printCarsByModel(cars, model);

        System.out.print("\nВведіть кількість років експлуатації: ");
        int yearsInUse = scanner.nextInt();
        System.out.println("\nСписок автомобілів моделі " + model + ", які експлуатуються більше " + yearsInUse + " років:");
        printCarsByModelAndUsage(cars, model, yearsInUse);

        System.out.print("\nВведіть рік випуску: ");
        int year = scanner.nextInt();
        System.out.print("Введіть мінімальну ціну: ");
        double price = scanner.nextDouble();
        System.out.println("\nСписок автомобілів " + year + " року випуску, ціна яких більше " + price + ":");
        printCarsByYearAndPrice(cars, year, price);
    }
    public static boolean isModelInList(List<Car> cars, String model) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model)) {
                return true;
            }
        }
        return false;
    }
    // Метод для виведення автомобілів за моделлю
    public static void printCarsByModel(List<Car> cars, String model) {
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model)) {
                System.out.println(car);
            }
        }
    }

    // Метод для виведення автомобілів за моделлю і роками експлуатації
    public static void printCarsByModelAndUsage(List<Car> cars, String model, int yearsInUse) {
        int currentYear = java.time.Year.now().getValue();
        for (Car car : cars) {
            if (car.getModel().equalsIgnoreCase(model) && (currentYear - car.getYear()) > yearsInUse) {
                System.out.println(car);
            }
        }
    }

    // Метод для виведення автомобілів за роком випуску і ціною
    public static void printCarsByYearAndPrice(List<Car> cars, int year, double price) {
        for (Car car : cars) {
            if (car.getYear() == year && car.getPrice() > price) {
                System.out.println(car);
            }
        }
    }
}
