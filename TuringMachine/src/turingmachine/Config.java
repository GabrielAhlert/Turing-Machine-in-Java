/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turingmachine;

import java.util.ArrayList;

/**
 *
 * @author gabri
 */
public class Config {
    private String fita;
    private String StartState;
    private ArrayList states;
    private String StartHead;

    public Config(String fita, String StartState, String sh) {
        this.fita = fita;
        this.StartState = StartState;
        this.StartHead = sh;
    }

    public String getFita() {
        return fita;
    }

    public String getStartState() {
        return StartState;
    }

    public ArrayList getStates() {
        return states;
    }

    public void setFita(String fita) {
        this.fita = fita;
    }

    public void setStartState(String StartState) {
        this.StartState = StartState;
    }

    public void setStates(ArrayList states) {
        this.states = states;
    }

    public String getStartHead() {
        return StartHead;
    }

    public void setStartHead(String StartHead) {
        this.StartHead = StartHead;
    }
    

     
    
    
}
