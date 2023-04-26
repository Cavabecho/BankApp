package danylo.bank.app.customers.interfaces;


/**
 * This interface responsible for keeping bronze customer methods.
 */
public interface BronzeCustomerInterface {
    /**
     * This method tops up the customer's balance and increases the total bank account
     * by the value of amount.
     *
     * @param amount The value by which balance and bank account will be increased
     */
    void topUpBalance(Double amount);

    /**
     * This method withdraws money from customer's balance and reduces the total bank account
     * by the value of amount.
     *
     * @param amount The value by which balance and bank account will be reduced
     */
    void withdrawMoney(Double amount);
}
