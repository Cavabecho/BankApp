package danylo.bank.app.customers;

import danylo.bank.app.bankers.MiddleBanker;
import danylo.bank.app.customers.interfaces.SilverCustomerInterface;


/**
 * Is subclass for the BronzeCustomer class.
 * Implements SilverCustomerInterface interface.
 * This class stores implementations of methods,
 * that going to make money requests to the middle banker class.
 * Customers of this class can:
 * top up balance / withdraw money / take out credit for a limited amount such as 10_000 zł.
 */
public class SilverCustomer extends BronzeCustomer implements SilverCustomerInterface {
    /**
     * Constructor for SilverCustomer class.
     * Initializes the SilverCustomer object with the given customerName, customerID, salaryPerMonth.
     *
     * @param customerName   String representing the name of the customer
     * @param customerID     Integer representing the ID of the customer
     * @param salaryPerMonth BigDecimal representing the salary per month of the customer
     */
    public SilverCustomer(String customerName, Integer customerID, Double salaryPerMonth) {
        super(customerName, customerID, salaryPerMonth);
    }

    @Override
    public void takeCredit(Double amount, MiddleBanker middleBanker) {
        middleBanker.handleTakeCredit(amount, this);
    }

    @Override
    public void payCredit(Double amount, MiddleBanker middleBanker) {
        middleBanker.handlePayCredit(amount, this);
    }
}
