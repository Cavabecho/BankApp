package danylo.bank.app.customers;


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
    private final Double salaryPerMonth;
    private Double balance;
    private Double credit;

    /**
     * Constructor for Customer abstract class.
     * Initializes the customer object with the given customerName, customerID, salaryPerMonth.
     * Also initializes the balance to zero.
     * Calculate CUSTOMER_PRIORITY based on salaryPerMonth.
     *
     * @param customerName   String representing the name of the customer
     * @param customerID     Integer representing the ID of the customer
     * @param salaryPerMonth BigDecimal representing the salary per month of the customer
     */
    public Customer(String customerName, Integer customerID, Double salaryPerMonth) {
        this.CUSTOMER_NAME = customerName;
        this.CUSTOMER_ID = customerID;
        this.salaryPerMonth = salaryPerMonth;
        this.balance = 0.0;
        this.credit = 0.0;

        if (salaryPerMonth >= 10_000.0) {
            CUSTOMER_PRIORITY = "Gold";
        } else if (salaryPerMonth >= 5000.0) {
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
    public Double getBalance() {
        return balance;
    }

    /**
     * Increases the value of balance by the value of amount.
     *
     * @param amount The value by which balance will be increased
     */
    public void increaseBalance(Double amount) {
        this.balance += amount;
    }

    /**
     * Reduces the value of balance by the value of amount.
     *
     * @param amount The value by which balance will be reduced
     */
    public void reduceBalance(Double amount) {
        this.balance -= amount;
    }

    /**
     * Returns the value of salaryPerMonth.
     *
     * @return The value of salaryPerMonth
     */
    public Double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    /**
     * Returns the value of credit.
     *
     * @return The value of credit
     */
    public Double getCredit() {
        return credit;
    }

    /**
     * Increases the value of credit by the value of amount.
     *
     * @param amount The value by which credit will be increased
     */
    public void increaseCredit(Double amount) {
        this.credit += amount;
    }

    /**
     * Reduces the value of credit by the value of amount.
     *
     * @param amount The value by which credit will be reduced
     */
    public void reduceCredit(Double amount) {
        this.credit -= amount;
    }
}
