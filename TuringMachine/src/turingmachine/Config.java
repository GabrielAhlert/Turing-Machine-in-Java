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
    public Node fita;
    public String StartState;
    public ArrayList states;

    public Config(Node fita, String StartState) {
        this.fita = fita;
        this.StartState = StartState;
    }

    public Config() {
    }
    
    
    
}
