/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

import java.util.Scanner;

/**
 *
 * @author aaron
 */
import java.io.Serializable;
public class GameMenuView implements Serializable{
    
    private MemoryGame memorygame;
    private GameMenuControl gameMenuControl ; 


    private final static String[][] menuItems = {
        {"D", "Display the board"},
        {"N", "New Game"},
        {"R", "Report stastics"},
        {"P", "Change game preferences"},
        {"H", "Help"},
        {"Q", "QUIT"}
    };

    public GameMenuView(MemoryGame memorygame) {
        this.gameMenuControl = new GameMenuControl();
        
    }

    
    
    public void getInput() {
   
        String command;
        Scanner inFile = new Scanner(System.in);

        do {    
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "D":
                    gameMenuControl.displayContinue();
                    break;
                case "N":
                    gameMenuControl.startNewGame();
                    break;
                case "R":
                    gameMenuControl.displayStatistics();
                    break;
                case "P":
                    gameMenuControl.displayPreferencesMenu();
                    break;
                case "H":
                    gameMenuControl.displayHelpMenu();
                    break;
                case "Q":                   
                    break;
                default: 
                    new MemoryGameError().displayError("Invalid command. Please enter a valid command.");
                    continue;                              
            }
        } while (!command.equals("Q"));

        return;
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GameMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }

    public GameMenuView() {
    }
  
}
