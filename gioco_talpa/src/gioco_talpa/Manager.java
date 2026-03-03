/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gioco_talpa;

import java.util.ArrayList;
import java.util.Timer;

/**
 *
 * @author polenzani.pietro
 */
public class Manager {
    private Timer gameTime;
    private int score;
    Difficulty diff;
    
    private Talpa talpa;
    private ArrayList<Buca> buche;
    private Giocatore player;
}
