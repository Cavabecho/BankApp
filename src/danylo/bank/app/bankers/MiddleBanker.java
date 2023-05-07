package danylo.bank.app.bankers;

import danylo.bank.app.DaniloBank;
import danylo.bank.app.bankers.interfaces.MiddleBankerInterface;
import danylo.bank.app.customers.SilverCustomer;

/**
 * Is subclass for JuniorBanker class.
 * Implements MiddleBankerInterface interface.
 * This class stores implementation of the middle banker methods,
 * that going to handle silver customer requests.
 */
public class MiddleBanker extends JuniorBanker implements MiddleBankerInterface {
    /**
     * Constructor for MiddleBanker class.
     * Initializes the MiddleBanker object with the given bankerName, bankerPosition, and bankerID.
     *
     * @param bankerName     String representing the name of the banker
     * @param bankerPosition String representing the position of the banker
     * @param bankerID       Integer representing the ID of the banker
     */
    public MiddleBanker(String bankerName, String bankerPosition, Integer bankerID) {
        super(bankerName, bankerPosition, bankerID);
    }

    @Override
    public void handleTakeCredit(Double amount, SilverCustomer silverCustomer) {
        double limitedAmountOfCredit = 10_000.0;

        if (limitedAmountOfCredit >= amount && amount <= DaniloBank.getTotalBankAccount() / 4.0) {

            silverCustomer.increaseBalance(amount);
            silverCustomer.increaseCredit(amount);
            DaniloBank.increaseTotalCustomersCredit(amount);
            DaniloBank.reduceTotalBankAccount(amount);

            System.out.println("U successfully take out a credit : " + amount);

        } else if (DaniloBank.getTotalBankAccount() == 0.0) {
            System.out.println("Right now bank do not have money to give u");
        } else {
            System.out.println("You can't take out a credit on an amount that is bigger than 10_000zł");
        }
    }

    @Override
    public void handlePayCredit(Double amount, SilverCustomer silverCustomer) {
        if (silverCustomer.getCredit() > amount) {

            silverCustomer.reduceBalance(amount);
            silverCustomer.reduceCredit(amount);
            DaniloBank.reduceTotalCustomersCredit(amount);
            DaniloBank.increaseTotalBankAccount(amount);

            System.out.println("U successfully payed a credit on the amount : " + amount +
                    " Now ur credit is " + silverCustomer.getCredit());

        } else {
            double remainder = amount - silverCustomer.getCredit();

            silverCustomer.reduceBalance(silverCustomer.getCredit());
            silverCustomer.reduceCredit(silverCustomer.getCredit());
            silverCustomer.increaseBalance(remainder);
            DaniloBank.reduceTotalCustomersCredit(silverCustomer.getCredit());
            DaniloBank.increaseTotalBankAccount(silverCustomer.getCredit());

            System.out.println("U successfully repaid the credit. Remainder from ur amount was added to the balance. " +
                    "Remainder is : " + remainder + ". Balance is : " + silverCustomer.getBalance());
        }
    }
}
