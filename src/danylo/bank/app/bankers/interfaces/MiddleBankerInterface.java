package danylo.bank.app.bankers.interfaces;

import danylo.bank.app.customers.SilverCustomer;

/**
 * This interface is responsible for keeping middle banker methods.
 * Extends junior banker functional.
 */
public interface MiddleBankerInterface extends JuniorBankerInterface{
    /**
     * Handler for the takeCredit method.
     */
    void handleTakeCredit(Double amount, SilverCustomer silverCustomer);

    /**
     * Handler for the payCredit method
     */
    void handlePayCredit();
}
