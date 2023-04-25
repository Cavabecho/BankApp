package danylo.bank.app.bankers;

import danylo.bank.app.bankers.interfaces.MiddleBankerInterface;

/**
 * Is subclass for Banker abstract class.
 * Implements MiddleBankerInterface interface.
 * This class stores implementation of the middle banker methods,
 * that going to handle silver customer requests.
 */
public class MiddleBanker extends Banker implements MiddleBankerInterface {
    /**
     * Constructor for MiddleBanker class.
     * Initializes the MiddleBanker object with the given bankerName, bankerPosition, and bankerID.
     *
     * @param bankerName     String representing the name of the banker
     * @param bankerPosition String representing the position of the banker
     * @param bankerID       Integer representing the ID of the banker
     */
    public MiddleBanker(String bankerName, String bankerPosition, Integer bankerID) {
        super(bankerName, bankerPosition, bankerID);
    }

    @Override
    public void handleTopUpBalance() {

    }

    @Override
    public void handleWithdrawMoney() {

    }

    @Override
    public void handleTakeCredit() {

    }
}
