package danylo.bank.app.customers;

import danylo.bank.app.customers.interfaces.BronzeCustomerInterface;

import java.math.BigDecimal;

/**
 * Is subclass for the Customer abstract class.
 * Implements BronzeCustomerInterface interface.
 * This class stores implementation of methods,
 * that going to make money requests to the junior banker class.
 * Customers of this class can only top up balance and withdraw money.
 */
public class BronzeCustomer extends Customer implements BronzeCustomerInterface {
    /**
     * Constructor for BronzeCustomer class.
     * Initializes the BronzeCustomer object with the given customerName, customerID, salaryPerMonth.
     *
     * @param customerName   String representing the name of the customer
     * @param customerID     Integer representing the ID of the customer
     * @param salaryPerMonth BigDecimal representing the salary per month of the customer
     */
    public BronzeCustomer(String customerName, Integer customerID, BigDecimal salaryPerMonth) {
        super(customerName, customerID, salaryPerMonth);
    }
}
