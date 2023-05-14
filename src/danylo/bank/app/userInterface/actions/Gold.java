package danylo.bank.app.userInterface.actions;

import danylo.bank.app.DaniloBank;
import danylo.bank.app.bankers.MiddleBanker;
import danylo.bank.app.bankers.SeniorBanker;
import danylo.bank.app.userInterface.Greetings;

import java.util.Scanner;

public class Gold {
    private static final Scanner scanner = new Scanner(System.in);
    public static DaniloBank daniloBank = new DaniloBank();
    public static SeniorBanker sb =
            new SeniorBanker("Employee3", "Gold", 3);

    public static void userChose() {
        int userChose = scanner.nextInt();

        switch (userChose) {
            case 1 -> {
                System.out.println("Your name is " + Greetings.goldCustomer.getCUSTOMER_NAME());
                System.out.println("Salary per month is " + Greetings.goldCustomer.getSalaryPerMonth());
                System.out.println(Greetings.goldCustomer.getCUSTOMER_PRIORITY() + " is ur priority");
                System.out.println("Balance is : " + Greetings.goldCustomer.getBalance());
            }
            case 2 -> {
                System.out.println("Enter amount : ");
                Double amountOfTop = scanner.nextDouble();
                Greetings.goldCustomer.topUpBalance(amountOfTop, sb);
            }
            case 3 -> {
                System.out.println("Enter amount : ");
                Double amountOfWithdraw = scanner.nextDouble();
                Greetings.goldCustomer.withdrawMoney(amountOfWithdraw, sb);
            }
            case 4 -> {
                System.out.println("Enter amount : ");
                Double amountOfTake = scanner.nextDouble();
                Greetings.goldCustomer.takeCredit(amountOfTake, sb);
            }
            case 5 -> {
                System.out.println("Enter amount : ");
                Double amountOfPay = scanner.nextDouble();
                Greetings.goldCustomer.payCredit(amountOfPay, sb);
            }
            case 6 -> {
                System.out.println("Enter amount : ");
                Double amountOfInvest = scanner.nextDouble();
                Greetings.goldCustomer.investMoney(amountOfInvest, sb);
            }
        }
    }
}
