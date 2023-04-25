package danylo.bank.app.bankers;

import danylo.bank.app.bankers.interfaces.JuniorBankerInterface;

/**
 * Is subclass for Banker abstract class.
 * Implements JuniorBankerInterface interface.
 * This class stores implementation of the junior banker methods,
 * that going to handle bronze customer requests.
 */
public class JuniorBanker extends Banker implements JuniorBankerInterface {
    /**
     * Constructor for JuniorBanker class.
     * Initializes the JuniorBanker object with the given bankerName, bankerPosition, and bankerID.
     *
     * @param bankerName     String representing the name of the banker
     * @param bankerPosition String representing the position of the banker
     * @param bankerID       Integer representing the ID of the banker
     */
    public JuniorBanker(String bankerName, String bankerPosition, Integer bankerID) {
        super(bankerName, bankerPosition, bankerID);
    }

    @Override
    public void handleTopUpBalance() {

    }

    @Override
    public void handleWithdrawMoney() {

    }
}
