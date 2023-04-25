package danylo.bank.app.customers.interfaces;

/**
 * This interface responsible for keeping gold customer methods.
 * Extends silver customer functional.
 */
public interface GoldCustomerInterface extends SilverCustomerInterface{
    void investMoney();
}
