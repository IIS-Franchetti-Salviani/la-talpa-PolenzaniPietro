/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gioco_talpa;

import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;

/**
 *
 * @author polenzani.pietro
 */
public class Manager {
    private Timer gameTime;
    private int score;
    private Difficulty diff;
    private int bucaAttiva;
    Random rnd;
    
    private Talpa talpa;
    private Buca[] buche;
    private Giocatore player;
    
        public void spawnTalpa() {
        if (bucaAttiva != -1) {
            buche[bucaAttiva].setIsFree(false);
            talpa.escape();
        }

        bucaAttiva = rnd.nextInt(9);

        buche[bucaAttiva].setIsFree(true);

        talpa.compariTalpa();
    }
    public void checkMole(int index) {
        if (buche[index].getIsFree()) {
            talpa.colpita();
            player.addPoints(talpa.getValue());
            buche[index].setIsFree(false);
            bucaAttiva = -1;
        }
    }
}
