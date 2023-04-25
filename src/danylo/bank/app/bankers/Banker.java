package danylo.bank.app.bankers;

import danylo.bank.app.customers.Customer;

import java.util.ArrayList;

/**
 * This class is responsible for keeping all data and behavior,
 * which are specific to the all bankers, the list of customers.
 * Also, this class is superclass for all bankers.
 * The subclasses of this class are handlers for customers requests.
 */
public abstract class Banker {
    private final String BANKER_NAME;
    private final String BANKER_POSITION;
    private final Integer BANKER_ID;
    private ArrayList<Customer> customers;

    /**
     * Constructor for Banker abstract class.
     * Initializes the Banker object with the given bankerName, bankerPosition, and bankerID.
     * Also initializes an empty ArrayList for customers.
     *
     * @param bankerName String representing the name of the banker
     * @param bankerPosition String representing the position of the banker
     * @param bankerID Integer representing the ID of the banker
     */
    public Banker(String bankerName, String bankerPosition, Integer bankerID) {
        this.BANKER_NAME = bankerName;
        this.BANKER_POSITION = bankerPosition;
        this.BANKER_ID = bankerID;
        this.customers = new ArrayList<>();
    }

    /**
     * Returns the value of bankerName.
     *
     * @return The value of bankerName
     */
    public String getBANKER_NAME() {
        return BANKER_NAME;
    }

    /**
     * Returns the value of bankerPosition.
     *
     * @return The value of bankerPosition
     */
    public String getBANKER_POSITION() {
        return BANKER_POSITION;
    }

    /**
     * Returns the value of bankerID.
     *
     * @return The value of bankerID
     */
    public Integer getBANKER_ID() {
        return BANKER_ID;
    }

    /**
     * Returns the value of customers.
     *
     * @return The value of customers
     */
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
}
