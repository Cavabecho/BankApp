package danylo.bank.app.bankers.interfaces;

import danylo.bank.app.customers.BronzeCustomer;

/**
 * This interface is responsible for keeping junior banker methods.
 */
public interface JuniorBankerInterface {
    /**
     * Handler for the topUpBalance method.
     */
    void handleTopUpBalance(Double amount, BronzeCustomer bronzeCustomer);

    /**
     * Handler for the withdrawMoney method.
     */
    void handleWithdrawMoney(Double amount, BronzeCustomer bronzeCustomer);
}
