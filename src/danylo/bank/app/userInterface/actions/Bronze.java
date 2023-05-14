package danylo.bank.app.userInterface.actions;

import danylo.bank.app.DaniloBank;
import danylo.bank.app.bankers.JuniorBanker;
import danylo.bank.app.userInterface.Greetings;

import java.util.Scanner;

public class Bronze {
    private static final Scanner scanner = new Scanner(System.in);
    public static DaniloBank daniloBank = new DaniloBank();
    public static JuniorBanker jb =
            new JuniorBanker("Employee1", "Junior", 1);

    public static void userChose() {
        int userChose = scanner.nextInt();

        switch (userChose) {
            case 1 -> {
                System.out.println("Your name is " + Greetings.bronzeCustomer.getCUSTOMER_NAME());
                System.out.println("Salary per month is " + Greetings.bronzeCustomer.getSalaryPerMonth());
                System.out.println(Greetings.bronzeCustomer.getCUSTOMER_PRIORITY() + " is ur priority");
                System.out.println("Balance is : " + Greetings.bronzeCustomer.getBalance());
            }
            case 2 -> {
                System.out.println("Enter amount : ");
                Double amountOfTop = scanner.nextDouble();
                Greetings.bronzeCustomer.topUpBalance(amountOfTop, jb);
            }
            case 3 -> {
                System.out.println("Enter amount : ");
                Double amountOfWithdraw = scanner.nextDouble();
                Greetings.bronzeCustomer.withdrawMoney(amountOfWithdraw, jb);
            }
        }
    }
}
