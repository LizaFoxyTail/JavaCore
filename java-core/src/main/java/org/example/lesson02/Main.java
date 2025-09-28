package org.example.lesson02;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PrintNums();
        CountNums();
        Multiply();

    }

    public static void PrintNums() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " "); //выводит каждое число без переноса на следующую строчку и через пробел
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void CountNums(){
        int sum = 0;
        System.out.println("Введите конечное число");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        for (int i = 1; i<=target; i++) {
            sum += i ;
        }
        System.out.println("Сумма = " + sum);
    }

    public static void Multiply(){
        System.out.println("Enter a number");
        int mul = 1;
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        for (int i = 1; i <= number; i++) {
            mul *= i;
        }
        System.out.println(mul);
    }
}