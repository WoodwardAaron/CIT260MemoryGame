package memorygame ;
import java.util.Scanner;



/**
 *
 * @author Aaron
 */
import java.io.Serializable;
public class HelpMenuView implements Serializable  {
        
    private final static String[][] menuItems = {
        {"B", "The board"},
        {"G", "The Memory game"},
        {"L", "Player Help"},
        {"Q", "Quit"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    // default constructor
    public HelpMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    
        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    } 
}
