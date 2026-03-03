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
public class Talpa {
    private boolean isVisible;
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
}
