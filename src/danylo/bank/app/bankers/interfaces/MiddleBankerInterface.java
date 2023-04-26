package danylo.bank.app.bankers.interfaces;

/**
 * This interface responsible for keeping middle banker methods.
 * Extends junior banker functional.
 */
public interface MiddleBankerInterface extends JuniorBankerInterface{
    /**
     * Handler for the takeCredit method.
     */
    void handleTakeCredit();

    /**
     * Handler for the payCredit method
     */
    void handlePayCredit();
}
