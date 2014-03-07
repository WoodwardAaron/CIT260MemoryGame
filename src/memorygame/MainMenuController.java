package memorygame;

/**
 *
 * @author Aaron
 */
import java.io.Serializable;
public class MainMenuController implements Serializable {
       
        public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }     
    public void displayStartGame() {
        
            //checkForMatch
        
    }
    
    
        
    public void displayHelpMenu() {
        System.out.println();
        displayHelpBorder();     
        System.out.println();
        HelpMenuView mainMenu = new HelpMenuView();
        displayHelpBorder();
    }
            
    public void displayPlayer() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\t Player Input "
                 ); 
        displayHelpBorder();
    }

    public MainMenuController() {
    }
    
        
        }   
     
     

