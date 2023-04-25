package danylo.bank.app.customers;

import java.math.BigDecimal;

/**
 * This class responsible for keeping all data and behavior,
 * which are specific to the customers.
 * Also, this class is the superclass for all customers.
 * The main thing, that subclasses of this class can do - is making money requests such as :
 * - Top up balance
 * - Withdraw money
 * - Take credit
 * - Invest to the Danilo Bank.
 */
public abstract class Customer {
    private final String CUSTOMER_NAME;
    private final String CUSTOMER_PRIORITY;
    private final Integer CUSTOMER_ID;
    private BigDecimal balance;
    private BigDecimal salaryPerMonth;

    /**
     * Constructor for Customer abstract class.
     * Initializes the customer object with the given customerName, customerID, salaryPerMonth.
     * Also initializes the balance to zero.
     * Calculate CUSTOMER_PRIORITY based on salaryPerMonth.
     *
     * @param customerName String representing the name of the customer
     * @param customerID Integer representing the ID of the customer
     * @param salaryPerMonth BigDecimal representing the salary per month of the customer
     */
    public Customer(String customerName, Integer customerID, BigDecimal salaryPerMonth) {
        this.CUSTOMER_NAME = customerName;
        this.CUSTOMER_ID = customerID;
        this.salaryPerMonth = salaryPerMonth;
        this.balance = BigDecimal.valueOf(0);

        if (salaryPerMonth.compareTo(BigDecimal.valueOf(10_000)) >= 0) {
            CUSTOMER_PRIORITY = "Gold";
        } else if (salaryPerMonth.compareTo(BigDecimal.valueOf(5000)) >= 0) {
            CUSTOMER_PRIORITY = "Silver";
        } else {
            CUSTOMER_PRIORITY = "Bronze";
        }
    }

    /**
     * Returns the value of CUSTOMER_NAME.
     *
     * @return The value of CUSTOMER_NAME
     */
    public String getCUSTOMER_NAME() {
        return CUSTOMER_NAME;
    }

    /**
     * Returns the value of CUSTOMER_PRIORITY.
     *
     * @return The value of CUSTOMER_PRIORITY
     */
    public String getCUSTOMER_PRIORITY() {
        return CUSTOMER_PRIORITY;
    }

    /**
     * Returns the value of CUSTOMER_ID.
     *
     * @return The value of CUSTOMER_ID
     */
    public Integer getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    /**
     * Returns the value of balance.
     *
     * @return The value of balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Returns the value of salaryPerMonth.
     *
     * @return The value of salaryPerMonth
     */
    public BigDecimal getSalaryPerMonth() {
        return salaryPerMonth;
    }
}
