package danylo.bank.app.customers;

import danylo.bank.app.customers.interfaces.GoldCustomerInterface;


/**
 * Is subclass for the Customer abstract class.
 * Implements GoldCustomerInterface interface.
 * This class stores implementation of methods,
 * that going to make money requests to the senior banker class.
 * Customers of this class can:
 * top up balance / withdraw money / invest money / take out credit
 * for an amount that is equal to 1/4 of all bank's money.
 */
public class GoldCustomer extends Customer implements GoldCustomerInterface {
    /**
     * Constructor for GoldCustomer class.
     * Initializes the GoldCustomer object with the given customerName, customerID, salaryPerMonth.
     *
     * @param customerName   String representing the name of the customer
     * @param customerID     Integer representing the ID of the customer
     * @param salaryPerMonth BigDecimal representing the salary per month of the customer
     */
    public GoldCustomer(String customerName, Integer customerID, Double salaryPerMonth) {
        super(customerName, customerID, salaryPerMonth);
    }

    @Override
    public void topUpBalance(Double amount) {

    }

    @Override
    public void withdrawMoney(Double amount) {

    }

    @Override
    public void investMoney(Double amount) {

    }

    @Override
    public void takeCredit(Double amount) {

    }
}
