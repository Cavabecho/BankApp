package danylo.bank.app.bankers;

import danylo.bank.app.DaniloBank;
import danylo.bank.app.bankers.interfaces.SeniorBankerInterface;
import danylo.bank.app.customers.GoldCustomer;

/**
 * Is subclass for MiddleBanker class.
 * Implements SeniorBankerInterface interface.
 * This class stores implementation of the senior banker methods,
 * that going to handle gold customer requests.
 */
public class SeniorBanker extends MiddleBanker implements SeniorBankerInterface {
    /**
     * Constructor for SeniorBanker class.
     * Initializes the SeniorBanker object with the given bankerName, bankerPosition, and bankerID.
     *
     * @param bankerName     String representing the name of the banker
     * @param bankerPosition String representing the position of the banker
     * @param bankerID       Integer representing the ID of the banker
     */
    public SeniorBanker(String bankerName, String bankerPosition, Integer bankerID) {
        super(bankerName, bankerPosition, bankerID);
    }

    @Override
    public void handleInvestMoney(Double amount, GoldCustomer goldCustomer) {
        if (amount < 0) {
            return;
        } else if (goldCustomer.getBalance() < amount) {
            System.out.println("U should top up ur balance first");
        } else {
            DaniloBank.increaseTotalBankAccount(amount);
            goldCustomer.reduceBalance(amount);

            System.out.println("Thank u for supporting us! Donated amount is : " + amount);
        }
    }

    public void handleTakeCredit(Double amount, GoldCustomer goldCustomer) {
        double limitedAmountOfCredit = DaniloBank.getTotalBankAccount() / 4.0;

        if (limitedAmountOfCredit >= amount) {

            goldCustomer.increaseBalance(amount);
            goldCustomer.increaseCredit(amount);
            DaniloBank.increaseTotalCustomersCredit(amount);
            DaniloBank.reduceTotalBankAccount(amount);

            System.out.println("U successfully take out a credit : " + amount);

        } else if (DaniloBank.getTotalBankAccount() == 0.0) {
            System.out.println("Right now bank do not have money to give u");
        }
    }
}
