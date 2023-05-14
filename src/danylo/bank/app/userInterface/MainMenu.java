package danylo.bank.app.userInterface;

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
            System.out.println("1. Info about my account");
            System.out.println("2. Top Up balance");
            System.out.println("3. Withdraw money");

            BronzeActions.userChose();
        } else if (Greetings.silverCustomer != null
                && Objects.equals(Greetings.silverCustomer.getCUSTOMER_PRIORITY(), "Silver")) {
            System.out.println("1. Info about my account");
            System.out.println("2. Top Up balance");
            System.out.println("3. Withdraw money");
            System.out.println("4. Take out credit");
        } else if (Greetings.goldCustomer != null
                && Objects.equals(Greetings.goldCustomer.getCUSTOMER_PRIORITY(), "Gold")) {
            System.out.println("1. Info about my account");
            System.out.println("2. Top Up balance");
            System.out.println("3. Withdraw money");
            System.out.println("4. Take out credit");
            System.out.println("5. Invest money to the Bank");
        } else {
            System.out.println("No customer found");
        }
    }
}
