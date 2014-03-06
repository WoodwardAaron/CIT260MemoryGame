package memorygame;

import java.util.Scanner;

/**
 *
 * @author Skylar
 */
public class MemoryGame {
    String name;
    String instructions = "This is the memory game. You must begin by selecting two positions 1)by selecting \n"
            +"the letter column with the number row to select the square to be turned over. After the first \n"
            + "selection press enter and then select your second option and press enter again. If the two \n"
            + "squares are the same then the squares stay facing up. If the squares are not a match then they \n"
            + "flip back over until all are matched with their pairs. The game ends when all pairs are matched.\n";
    
    public static void main(String[] args) {
      MemoryGame myGame = new MemoryGame();
      myGame.getName();
      myGame.displayHelp();
      MainMenuView mainMenu = new MainMenuView();
      MainMenuController mainMenuController = new MainMenuController();
      HelpMenuControl helpMenuControl = new HelpMenuControl();
      String command;
      Board board = new Board();
       do {
         //add a do while loop here
        command=mainMenu.getInput();
        switch (command) {
                case "A":
                    //mainMenuController.displayStartGame();
                    do {
                        //this is where the game runs
                        
                        board.display();
                        Scanner inFile = new Scanner(System.in);
                        command = inFile.nextLine();
                        command = command.trim().toUpperCase();
                        switch (command) {
                            case "B":
                                helpMenuControl.displayBoardHelp();
                                break;
                            case "G":
                                helpMenuControl.displayGameHelp();
                                break;                  
                            case "L":
                                helpMenuControl.displayRealPlayerHelp();
                                break;
                            case "M":
                                board.getCoord();
                                break;
                            case "Q": 
                    
                                break;
                            default: 
                                new MemoryGameError().displayError("Invalid command. Please enter a valid command.");
                                break;
                                        
                            }
                    }
                    while(command.equals("Q")==false);
                    break;
                case "B":
                    mainMenuController.displayHelpMenu();
                    break;                  
                case "C":
                    mainMenuController.displayPlayer();
                    break;
                case "Q": 
                    break;
                default: 
                    new MemoryGameError().displayError("Invalid command. Please enter a valid command.");
                    break;
            }
        // add another do while loop here
        // code to run game goes here
        // add a switch statement here
      
    
 
       }
       while (command.equals("Q")==false);
    }
    
    public void getName(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    this.name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    

    }
}   

