package danylo.bank.app.customers;

import danylo.bank.app.customers.interfaces.SilverCustomerInterface;

/**
 * Is subclass for Customer abstract class.
 * Implements SilverCustomerInterface interface.
 * This class keeps implementations of methods,
 * that going to make money requests to the middle banker class.
 * Customers of this class can
 * top up balance / withdraw money / take out credit for a limited amount such as 10_000 zł.
 */
public class SilverCustomer extends Customer implements SilverCustomerInterface {
}
