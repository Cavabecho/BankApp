package danylo.bank.app;

import danylo.bank.app.bankers.Banker;
import danylo.bank.app.customers.Customer;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * This class responsible for stores all customers money and list of bankers.
 */
public class DaniloBank {
    private static BigDecimal totalBankAccount;
    private static BigDecimal totalCustomersCredit;
    private ArrayList<Banker> bankers;

    /**
     * Constructor for DaniloBank class.
     * Initializes the totalBankAccount and totalCustomersCredit to zero.
     * Also initializes an empty ArrayList for bankers.
     */
    public DaniloBank() {
        totalBankAccount = BigDecimal.valueOf(0);
        totalCustomersCredit = BigDecimal.valueOf(0);
        this.bankers = new ArrayList<>();
    }

    /**
     * Returns the value of totalBankAccount.
     *
     * @return The value of totalBankAccount
     */
    public static BigDecimal getTotalBankAccount() {
        return totalBankAccount;
    }

    /**
     * Returns the value of totalCustomersCredit.
     *
     * @return The value of totalCustomersCredit
     */
    public static BigDecimal getTotalCustomersCredit() {
        return totalCustomersCredit;
    }

    /**
     * Returns the value of bankers.
     *
     * @return The value of bankers
     */
    public ArrayList<Banker> getBankers() {
        return bankers;
    }
}
