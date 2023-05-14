package danylo.bank.app;


import danylo.bank.app.userInterface.BronzeActions;
import danylo.bank.app.userInterface.Greetings;
import danylo.bank.app.userInterface.MainMenu;

/**
 * This file starts execution of the program.
 */
public class Main {
    public static void main(String[] args) {
        Greetings.displayGreetings();
        MainMenu.displayMenu();
    }
}
