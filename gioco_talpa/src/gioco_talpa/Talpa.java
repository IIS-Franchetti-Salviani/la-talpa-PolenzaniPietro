/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gioco_talpa;

import java.util.Timer;

/**
 *
 * @author polenzani.pietro
 */
public class Talpa extends Thread{
    private boolean isVisible;
    private boolean colpita;
    private int value;
    private int timer;

    public Talpa(boolean isVisible, int value, int timer) {
        this.isVisible = isVisible;
        this.value = value;
        this.timer = timer;
    }
    
    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }
    
    public void nascondiTalpa(){
        this.setIsVisible(false);       
    }
    
    public void compariTalpa(){
        this.setIsVisible(true);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void escape(){
        if(!colpita){
            this.setIsVisible(false);
        }
    }

    public boolean isColpita() {
        return colpita;
    }

    public void setColpita(boolean colpita) {
        this.colpita = colpita;
    }
    public void colpita(){
        if(!colpita){
            this.setColpita(true);
            this.setIsVisible(false);
        }
    }
    
}
