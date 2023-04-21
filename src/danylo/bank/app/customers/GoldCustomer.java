package danylo.bank.app.customers;

import danylo.bank.app.customers.interfaces.GoldCustomerInterface;

/**
 * Is subclass for Customer abstract class.
 * Implements GoldCustomerInterface interface.
 * This class keeps methods, that going to make money requests to the senior banker class.
 * Customers of this class can
 * top up balance / withdraw money / invest money / take out credit
 * for an amount that is equal to 1/4 of all bank's money.
 */
public class GoldCustomer extends Customer implements GoldCustomerInterface {
}
