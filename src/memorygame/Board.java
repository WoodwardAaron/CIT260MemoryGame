/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import java.util.Scanner;

/**
 *
 * @author Skylar
 */
public class Board {
    
    private int r1,c1;
    private int r2,c2;
    
    private boolean firstTurn =true;
    
    private final char[][]cards = new char [][]{
    {'A','A','B','B'},
    {'C','C','D','D'},
    {'E','E','F','F'},
    {'G','G','H','H'}
};
    private boolean [][] matchCards = new boolean [4][4];
    
    
    public void display(){
        System.out.print("  A  B  C  D \n");
        for (int r = 0; r< 4; r++){
            System.out.print(r+1);
            for (int c = 0; c< 4; c++){
                if (!firstTurn
                        && r==r1 && c==c1){
                    System.out.print(" " + cards[r1][c1] + " ");
                    
                }
                else if (!firstTurn
                        && r==r2 && c==c2)
                    System.out.print(" " + cards[r2][c2] + " ");
                else if (matchCards[r][c]==true)
                    System.out.print(" " + cards[r][c] + " ");
                else 
                System.out.print(" # ");
                      
            }
        System.out.println();
        }
        System.out.print("Type M to begin\n");
        firstTurn=false;
    }
    public void getMatch(){
        if (cards[r1][c1]==cards[r2][c2]){
        matchCards[r1][c1]=true;
        matchCards[r2][c2]=true;
        System.out.print("You Got a Match\n");
        }
                       
    }
    public void getCoord(){
        String coord;
        System.out.println("Put in a coordinate such as (A1))");
        Scanner inFile = new Scanner(System.in);
        coord = inFile.nextLine();
        
        r1=(int)coord.charAt(1)-49; 
        
        
        if (coord.charAt(0)=='A'){
        c1=0;
        }
        else if (coord.charAt(0)=='B'){
        c1=1;
        }
        else if (coord.charAt(0)=='C'){
        c1=2;
        }
        else if (coord.charAt(0)=='D'){
        c1=3;
        }
        else {
            System.out.print("ERROR, Please enter a valid Coordinate /n");
            return;
        }
        //This is where you get the second coordinate
        System.out.println("Enter in a Second Coordinate");
        Scanner inFile2 = new Scanner(System.in);
        coord = inFile2.nextLine();
        
        r2=(int)coord.charAt(1)-49; 
        
        
        if (coord.charAt(0)=='A'){
        c2=0;
        }
        else if (coord.charAt(0)=='B'){
        c2=1;
        }
        else if (coord.charAt(0)=='C'){
        c2=2;
        }
        else if (coord.charAt(0)=='D'){
        c2=3;
        }
        else System.out.print("Error, Please enter a valid Coordinate /n");
        
        //this is where we check for match
        getMatch();
        
    }        
}

