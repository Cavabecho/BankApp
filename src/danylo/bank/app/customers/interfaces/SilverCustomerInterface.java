package danylo.bank.app.customers.interfaces;

/**
 * This interface responsible for keeping silver customer methods.
 * Extends bronze customer functional.
 */
public interface SilverCustomerInterface extends BronzeCustomerInterface{
    void takeCredit();
}
