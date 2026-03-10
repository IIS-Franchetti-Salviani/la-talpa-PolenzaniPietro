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
    
    
    public Manager() {
    rnd = new Random();
    bucaAttiva = -1;
    buche = new Buca[9];
    for (int i = 0; i < buche.length; i++) {
         buche[i] = new Buca();
    }    
    talpa = new Talpa(false, 10, 1000);
    player = new Giocatore();
}
    
    
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
    
     public void cicloTalpa() {
        Thread t = new Thread(() -> {
            while (true) {
                try {
                    spawnTalpa();
                    Thread.sleep(rnd.nextInt(1000, 2001));
                } catch (InterruptedException e) {
                    break;
                }
            }
        });
        t.start();
    }
}
