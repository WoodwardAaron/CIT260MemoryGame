/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;


/**
 *
 * @author Skylar
 */
public class HelpMenuControl  {
    
    public HelpMenuControl() {
        
    } 

    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\t The game board for Memory Game. It consist of 16 cards layed out  "
                + "\n\t in a 4x4 display. The player chooses cards on the grid to find two "
                + "\n\t matching cards per set. The default board has all cards faced down.");
        displayHelpBorder();
    }
    
    
        
    public void displayGameHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to select matching cards and clear the board of  "
                + "\n\t all the cards. The player will continue playing the game until all cards "
                + "\n\t are matched with their pairs. "
                 ); 
        displayHelpBorder();
    }
            
    public void displayRealPlayerHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\t The player selects the number of the card in the grid to flip over two at a time "
                 ); 
        displayHelpBorder();
    }
    
    //public void display
    
        

                     
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
  
}
