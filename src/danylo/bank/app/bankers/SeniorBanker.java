package danylo.bank.app.bankers;

import danylo.bank.app.bankers.interfaces.SeniorBankerInterface;

/**
 * Is subclass for Banker abstract class.
 * Implements SeniorBankerInterface interface.
 * This class stores implementation of the senior banker methods,
 * that going to handle gold customer requests.
 */
public class SeniorBanker extends Banker implements SeniorBankerInterface {
    /**
     * Constructor for SeniorBanker class.
     * Initializes the SeniorBanker object with the given bankerName, bankerPosition, and bankerID.
     *
     * @param bankerName     String representing the name of the banker
     * @param bankerPosition String representing the position of the banker
     * @param bankerID       Integer representing the ID of the banker
     */
    public SeniorBanker(String bankerName, String bankerPosition, Integer bankerID) {
        super(bankerName, bankerPosition, bankerID);
    }
}
