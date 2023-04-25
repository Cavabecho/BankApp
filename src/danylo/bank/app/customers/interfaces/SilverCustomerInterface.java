package danylo.bank.app.customers.interfaces;


/**
 * This interface responsible for keeping silver customer methods.
 * Extends bronze customer functional.
 */
public interface SilverCustomerInterface extends BronzeCustomerInterface{
    /**
     * This method tops up the customer's balance, increases the total customers credit
     * and reduces the total bank account by the value of amount.
     *
     * @param amount The value by which balance and customers credit will be increased
     *               and bank account will be reduced
     */
    void takeCredit(Double amount);
}
