package danylo.bank.app.customers;

import danylo.bank.app.customers.interfaces.BronzeCustomerInterface;

/**
 * Is subclass for the Customer abstract class.
 * Implements BronzeCustomerInterface interface.
 * This class stores implementation of methods,
 * that going to make money requests to the junior banker class.
 * Customers of this class can only top up balance and withdraw money.
 */
public class BronzeCustomer extends Customer implements BronzeCustomerInterface {
}
