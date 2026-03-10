package gioco_talpa;

public class Giocatore {

    private int points;

    public Giocatore() {
        points = 0;
    }

    public void addPoints(int p) {
        points += p;
    }

    public int getPoints() {
        return points;
    }

}