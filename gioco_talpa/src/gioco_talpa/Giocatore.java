/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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