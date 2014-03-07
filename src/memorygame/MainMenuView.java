package memorygame;

import java.util.Scanner;

/**
 *
 * @author Aaron
 */
import java.io.Serializable;
public class MainMenuView implements Serializable {
private final static String[][] menuItems = {
        {"A", "Start Game"},
        {"B", "Help Menu"},
        {"C", "Player Stats"},
        {"Q", "Quit"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private MainMenuController MainMenuController = new MainMenuController();
    
    // default constructor
    public MainMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
     String getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
         
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            
          
        
         return command;
    }

        // displays the help menu
    private final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
  
    }

   
  
}
 
