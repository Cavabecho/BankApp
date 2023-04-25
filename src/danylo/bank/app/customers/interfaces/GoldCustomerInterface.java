package danylo.bank.app.customers.interfaces;

import java.math.BigDecimal;

/**
 * This interface responsible for keeping gold customer methods.
 * Extends silver customer functional.
 */
public interface GoldCustomerInterface extends SilverCustomerInterface{
    /**
     * This method increases the total bank account and reduced customer's balance
     * by the value of amount.
     *
     * @param amount The value by which bank account will be increased
     *               and customer's balance will be reduced
     */
    void investMoney(BigDecimal amount);
}
