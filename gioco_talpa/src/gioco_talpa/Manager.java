package gioco_talpa;

import java.util.Random;

public class Manager {

    private int bucaAttiva;
    private Random rnd;
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
        }

        bucaAttiva = rnd.nextInt(9);

        buche[bucaAttiva].setIsFree(true);
        talpa.compariTalpa();
    }
    
    public void checkMole(int index) {
        if (index == bucaAttiva) {
            talpa.colpita();
            player.addPoints(talpa.getValue());
            buche[index].setIsFree(false);
            bucaAttiva = -1;
        }
    }
    public int getBucaAttiva() {
        return bucaAttiva;
    }
    public int getScore() {
        return player.getPoints();
    }

}