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
     * Increases the value of totalBankAccount by the value of amount.
     *
     * @param amount The value by which totalBankAccount will be increased
     */
    public static void increaseTotalBankAccount(Double amount) {
        DaniloBank.totalBankAccount += amount;
    }

    /**
     * Reduces the value of totalBankAccount by the value of amount.
     *
     * @param amount The value by which totalBankAccount will be reduced
     */
    public static void reduceTotalBankAccount(Double amount) {
        DaniloBank.totalBankAccount -= amount;
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
     * Increases the value of totalCustomersCredit by the value of amount.
     *
     * @param amount The value by which totalCustomersCredit will be increased
     */
    public static void increaseTotalCustomersCredit(Double amount) {
        DaniloBank.totalCustomersCredit += amount;
    }

    /**
     * Reduces the value of totalCustomersCredit by the value of amount.
     *
     * @param amount The value by which totalCustomersCredit will be reduced
     */
    public static void reduceTotalCustomersCredit(Double amount) {
        DaniloBank.totalCustomersCredit -= amount;
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
