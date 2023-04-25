package danylo.bank.app;

import danylo.bank.app.bankers.Banker;

import java.util.ArrayList;

/**
 * This class responsible for stores all customers money and list of bankers.
 */
public class DaniloBank {
    private static Double totalBankAccount;
    private static Double totalCustomersCredit;
    private ArrayList<Banker> bankers;

    /**
     * Constructor for DaniloBank class.
     * Initializes the totalBankAccount and totalCustomersCredit to zero.
     * Also initializes an empty ArrayList for bankers.
     */
    public DaniloBank() {
        totalBankAccount = 0.0;
        totalCustomersCredit = 0.0;
        this.bankers = new ArrayList<>();
    }

    /**
     * Returns the value of totalBankAccount.
     *
     * @return The value of totalBankAccount
     */
    public static Double getTotalBankAccount() {
        return totalBankAccount;
    }

    /**
     * Returns the value of totalCustomersCredit.
     *
     * @return The value of totalCustomersCredit
     */
    public static Double getTotalCustomersCredit() {
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
