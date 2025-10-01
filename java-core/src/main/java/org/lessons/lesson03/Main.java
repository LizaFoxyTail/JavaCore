package org.lessons.lesson03;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //__________________________________________________//
        Person person1 = new Person("Иван", 25);
        person1.introduce();

        Person person2 = new Person("Людмила", 30);
        person2.introduce();
    //__________________________________________________//
        System.out.print("Введите длину прямоугольника: ");
        double length = in.nextDouble();
        System.out.print("Введите ширину прямоугольника: ");
        double width = in.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Площадь: " + rectangle.CalculateSquare());
        System.out.println("Периметр: " + rectangle.CalculatePerimeter());
    //__________________________________________________//
        System.out.println("Введите страну, модель и год выпуска: ");
        String country = in.nextLine();
        String model = in.nextLine();
        int year = in.nextInt();
        Car car1 = new Car(country, model, year);
        car1.printCarInfo();
    }
}
// 1 task
class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Здравствуйте! Меня зовут " + name + ", мне " + age + " лет");
    }
}

// 2 task
class Rectangle{
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double CalculateSquare(){
        return  length * width;
    }

    public double CalculatePerimeter(){
        return 2 * (length + width);
    }
}

// 3 task
class Car {
    String country;
    String model;
    int yearOfManufacture;

    public Car(String country, String model, int yearOfManufacture) {
        this.country = country;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void printCarInfo(){
        System.out.println("Модель: " + model +
            ", страна производства: " + country +
            ", год выпуска: " + yearOfManufacture);
    }

}

//4 task
class BankAccount{
    String fio;
    int AccountNumber;
    double balance;

    public BankAccount(String fio, int AccountNumber, double balance) {
        this.fio = fio;
        this.AccountNumber = AccountNumber;
        this.balance = balance;

    }
}