package org.lessons.lesson03;

import java.util.Scanner;

public class BankAccount {
        String fio;
        int AccountNumber;
        double balance;

        public BankAccount(String fio, int AccountNumber, double balance) {
            this.fio = fio;
            this.AccountNumber = AccountNumber;
            this.balance = balance;
        }

        public void deposit(double balance){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите сумму для пополнения: ");
            double amount = in.nextDouble();

            if (amount > 0){
                balance += amount;
                System.out.println("На счет зачислено: \n" + amount +  "Новый баланс: \n" + balance);
            }
            else {
                System.out.println("Сумма пополнения должна быть положительной");
            }
        }

        public void withdraw(){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите сумму для вывода: ");
            double amount = in.nextDouble();
        }
    }