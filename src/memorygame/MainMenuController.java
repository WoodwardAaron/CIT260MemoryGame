/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

/**
 *
 * @author Skylar
 */
public class MainMenuController {
    

        
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
    
        
        }   
     
     

