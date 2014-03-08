/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

/**
 *
 * @author Aaron
 */
import java.io.Serializable;
public class Player implements Serializable {
    private String name;
    private String wins;
    private String losses;
    private String plays;

    public Player() {
    }
    public Player(String name, String wins, String losses, String plays) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
        this.plays = plays;
    }   
}
