package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Task 1 and Task 2
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please input a number:");
        int number = scanner.nextInt();

        // If number is divisible by 2 then itš an even number, else it is an odd number
        if ((number % 2) == 0)
            System.out.println("This number is even.");

        else {
            System.out.println("This number is odd.");
        }

        task3();
        task4();
        task5();
        task6();
        task7();
    }

    //Task 3
    static void task3() {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please input a number");
        int number2 = scanner.nextInt();
        if (number2 > 0) {
            System.out.println("The number is greater than zero.");
        }
        else if (number2 < 0) {
            System.out.println("The number is less than zero.");
        }
        else {
            System.out.println("The number is equal to zero.");
        }

    }

    //Task 4
    static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input height (cm): ");
        int height = scanner.nextInt();

        System.out.println("Please input weight (kg): ");
        float weight = scanner.nextInt();

        if (height > 150 && weight < 180) {
            System.out.println("Fasten your seatbelt!");
        } else {
            System.out.println("I am sorry, but you cannot ride the roller coaster. :(");
        }
    }

    //Task 5
    static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input temperature in Celsius: ");
        float Celsius = scanner.nextInt();
        double Fahrenheit = ((1.8 * Celsius) + 32.00);
        System.out.println("The temperature in Fahrenheit is: " + Fahrenheit);

    }

    //Task 6
    static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your income: ");
        double income = scanner.nextInt();
        if (income < 85528.00) {
            System.out.println("Your tax is: " + ((income * 0.18) - 556.02));
        }

        else {
            System.out.println("Your tax is: " + (14839.0 + (income-85528)*0.32));
        }

    }

    //Task 7
    //Heads up...I might have written some outputs in too many steps...but the program works?
    // I didn't know a more simple way to do this.
    static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the loan amount: ");
        double amount = scanner.nextDouble();

        if ((amount > 100) && (amount < 10000)) {
            System.out.println("The loan amount is acceptable.");
        } else if (amount > 10000) {
            System.out.println("The loan amount is set at 5,000.00");
        } else {
            System.out.println("The minimum loan amount is 100.");
        }

        System.out.println("Please input the number of installment: ");
        int installment = scanner.nextInt(); {
            if ((installment > 6) && (installment < 48)) {
                System.out.println("The installment number is acceptable.");
            } else if ((installment <6) && (installment > 48)) {
                System.out.println("The installment number is set to 36.");
            } else {
                System.out.println("The minimum installment is 6 months.");
            }
        }

        if ((amount > 10000) && ((installment < 6) || (installment > 48))) {
            System.out.println("Your monthly installment payment is: " + (5000/36));
            return;
        }
        if ((amount > 100) && (amount < 10000) && (installment > 6 || installment < 12)) {
            System.out.println("Your monthly installment payment is: " + (amount + 0.025)/installment);
            return;
        }
        if ((amount > 100) && (amount < 10000) && (installment > 13 || installment < 24)) {
            System.out.println("Your monthly installment payment is: " + (amount + 0.05)/installment);
            return;
        }
        if ((amount > 100) && (amount < 10000) && (installment > 25 || installment < 48)) {
            System.out.println("Your monthly installment payment is: " + (amount + 0.1)/installment);
            return;
        }

        }

        //Task 8
    }