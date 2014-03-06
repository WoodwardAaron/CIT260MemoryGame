/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package memorygame;

/**
 *
 * @author aaron
 */
public class GameMenuControl {

    private MemoryGame memorygame;
    private Board board;

    public GameMenuControl(Game game) {
        this.memorygame = memorygame;
        this.board = game.board;
    }

       
    

       
   public void displayContinue() {
        System.out.println("\n\tdisplayBoard() called");
    }
   
   
    public void startNewGame() {
        System.out.println("\n\tstartNewGame() called");
    }
    
    
            
    public void displayPreferencesMenu() {
        GamePreferencesMenuView gamePreferencesMenu = new GamePreferencesMenuView(this.game);
        gamePreferencesMenu.getInput();
    }
    
    
    public void displayStatistics() {
        String playerAStatistics = this.memorygame.playerA.getPlayerStastics();
        System.out.println("\n\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t " + playerAStatistics);
        
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    

    
    
    
}
