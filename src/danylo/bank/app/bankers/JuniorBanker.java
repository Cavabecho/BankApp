package danylo.bank.app.bankers;

import danylo.bank.app.DaniloBank;
import danylo.bank.app.bankers.interfaces.JuniorBankerInterface;
import danylo.bank.app.customers.BronzeCustomer;

/**
 * Is subclass for Banker abstract class.
 * Implements JuniorBankerInterface interface.
 * This class stores implementation of the junior banker methods,
 * that going to handle bronze customer requests.
 */
public class JuniorBanker extends Banker implements JuniorBankerInterface {
    /**
     * Constructor for JuniorBanker class.
     * Initializes the JuniorBanker object with the given bankerName, bankerPosition, and bankerID.
     *
     * @param bankerName     String representing the name of the banker
     * @param bankerPosition String representing the position of the banker
     * @param bankerID       Integer representing the ID of the banker
     */
    public JuniorBanker(String bankerName, String bankerPosition, Integer bankerID) {
        super(bankerName, bankerPosition, bankerID);
    }

    @Override
    public void handleTopUpBalance(Double amount, BronzeCustomer bronzeCustomer) {
        if (amount < 0) {
            System.out.println("Provided incorrect amount");
            return;
        }

        double newBalance = bronzeCustomer.getBalance() + amount;
        if (newBalance > 0) {
            DaniloBank.increaseTotalBankAccount(amount);
            bronzeCustomer.increaseBalance(amount);
        } else {
            System.out.println("There is the problem: newBalance is negative : " + bronzeCustomer.getBalance());
        }
    }

    @Override
    public void handleWithdrawMoney(Double amount, BronzeCustomer bronzeCustomer) {
        if (amount < 0) {
            System.out.println("Provided incorrect amount");
            return;
        }

        if (bronzeCustomer.getBalance() > amount) {
            DaniloBank.reduceTotalBankAccount(amount);
            bronzeCustomer.reduceBalance(amount);
        } else {
            System.out.println("You have not enough money. Your balance is : " + bronzeCustomer.getBalance());
        }
    }
}
