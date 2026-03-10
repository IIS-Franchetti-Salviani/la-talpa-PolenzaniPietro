
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */package gioco_talpa;


public class Talpa {

    private boolean isVisible;
    private int value;

    public Talpa(boolean isVisible, int value, int timer) {
        this.isVisible = isVisible;
        this.value = value;
    }

    public void compariTalpa() {
        isVisible = true;
    }

    public void nascondiTalpa() {
        isVisible = false;
    }
    public void colpita() {
        isVisible = false;
    }

    public int getValue() {
        return value;
    }
}