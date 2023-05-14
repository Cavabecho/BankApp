package danylo.bank.app.userInterface;

import danylo.bank.app.userInterface.actions.Bronze;
import danylo.bank.app.userInterface.actions.Gold;
import danylo.bank.app.userInterface.actions.Silver;

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

            Bronze.userChose();
        } else if (Greetings.silverCustomer != null
                && Objects.equals(Greetings.silverCustomer.getCUSTOMER_PRIORITY(), "Silver")) {
            System.out.println("1. Info about my account");
            System.out.println("2. Top Up balance");
            System.out.println("3. Withdraw money");
            System.out.println("4. Take out credit");
            System.out.println("5. Pay credit");

            Silver.userChose();
        } else if (Greetings.goldCustomer != null
                && Objects.equals(Greetings.goldCustomer.getCUSTOMER_PRIORITY(), "Gold")) {
            System.out.println("1. Info about my account");
            System.out.println("2. Top Up balance");
            System.out.println("3. Withdraw money");
            System.out.println("4. Take out credit");
            System.out.println("5. Pay credit");
            System.out.println("6. Invest money to the Bank");

            Gold.userChose();
        } else {
            System.out.println("No customer found");
        }
    }
}
