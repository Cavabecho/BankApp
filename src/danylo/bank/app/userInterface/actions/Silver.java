package danylo.bank.app.userInterface.actions;

import danylo.bank.app.DaniloBank;
import danylo.bank.app.bankers.MiddleBanker;
import danylo.bank.app.userInterface.Greetings;

import java.util.Scanner;

public class Silver {
    private static final Scanner scanner = new Scanner(System.in);
    public static DaniloBank daniloBank = new DaniloBank();
    public static MiddleBanker mb =
            new MiddleBanker("Employee2", "Middle", 2);

    public static void userChose() {
        int userChose = scanner.nextInt();

        switch (userChose) {
            case 1 -> {
                System.out.println("Your name is " + Greetings.silverCustomer.getCUSTOMER_NAME());
                System.out.println("Salary per month is " + Greetings.silverCustomer.getSalaryPerMonth());
                System.out.println(Greetings.silverCustomer.getCUSTOMER_PRIORITY() + " is ur priority");
                System.out.println("Balance is : " + Greetings.silverCustomer.getBalance());
            }
            case 2 -> {
                System.out.println("Enter amount : ");
                Double amountOfTop = scanner.nextDouble();
                Greetings.silverCustomer.topUpBalance(amountOfTop, mb);
            }
            case 3 -> {
                System.out.println("Enter amount : ");
                Double amountOfWithdraw = scanner.nextDouble();
                Greetings.silverCustomer.withdrawMoney(amountOfWithdraw, mb);
            }
            case 4 -> {
                System.out.println("Enter amount : ");
                Double amountOfTake = scanner.nextDouble();
                Greetings.silverCustomer.takeCredit(amountOfTake, mb);
            }
            case 5 -> {
                System.out.println("Enter amount : ");
                Double amountOfPay = scanner.nextDouble();
                Greetings.silverCustomer.payCredit(amountOfPay, mb);
            }
        }
    }
}
