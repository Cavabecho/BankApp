package danylo.bank.app.userInterface.menu;

import danylo.bank.app.customers.Customer;
import danylo.bank.app.customers.GoldCustomer;
import danylo.bank.app.userInterface.Greetings;

import java.util.Objects;
import java.util.Scanner;

public class MainMenu {
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        if (Greetings.bronzeCustomer != null
                && Objects.equals(Greetings.bronzeCustomer.getCUSTOMER_PRIORITY(), "Bronze")) {
            System.out.println("bronze");
        } else if (Greetings.silverCustomer != null
                && Objects.equals(Greetings.silverCustomer.getCUSTOMER_PRIORITY(), "Silver")) {
            System.out.println("silver");
        } else if (Greetings.goldCustomer != null
                && Objects.equals(Greetings.goldCustomer.getCUSTOMER_PRIORITY(), "Gold")) {
            System.out.println("gold");
        } else {
            System.out.println("No customer found");
        }
    }
}
