package danylo.bank.app.userInterface;

import danylo.bank.app.customers.BronzeCustomer;
import danylo.bank.app.customers.GoldCustomer;
import danylo.bank.app.customers.SilverCustomer;

import java.util.Scanner;

/**
 * I don't know what this class is for yet.
 */
public class Greetings {
    private static final Scanner scanner = new Scanner(System.in);
    static BronzeCustomer bronzeCustomer;
    static SilverCustomer silverCustomer;
    static GoldCustomer goldCustomer;

    public static void displayGreetings() {
        System.out.println("Hello there! Let's get started internship with Danilo Bank.");

        System.out.println("Enter your name : ");
        String customerName = scanner.next();

        System.out.println("Enter your salary per month : ");
        try {
            Double customerSalaryPerMonth = scanner.nextDouble();
            if (customerSalaryPerMonth >= 10_000.0) {
                goldCustomer = new GoldCustomer(customerName, 1, customerSalaryPerMonth);
                System.out.println("Congrats " + goldCustomer.getCUSTOMER_NAME() + ". Now u are customer of our Bank!");
            } else if (customerSalaryPerMonth >= 5000.0) {
                silverCustomer = new SilverCustomer(customerName, 1, customerSalaryPerMonth);
                System.out.println("Congrats " + silverCustomer.getCUSTOMER_NAME() + ". Now u are customer of our Bank!");
            } else {
                bronzeCustomer = new BronzeCustomer(customerName, 1, customerSalaryPerMonth);
                System.out.println("Congrats " + bronzeCustomer.getCUSTOMER_NAME() + ". Now u are customer of our Bank!");
            }
        } catch (Exception e) {
            System.out.println("Enter an amount of your salary!");
        }
    }
}
