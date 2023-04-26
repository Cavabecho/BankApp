package danylo.bank.app.bankers.interfaces;

/**
 * This interface is responsible for keeping senior banker methods.
 * Extends middle banker functional.
 */
public interface SeniorBankerInterface extends MiddleBankerInterface{
    /**
     * Handler for the investMoney method.
     */
    void handleInvestMoney();
}
