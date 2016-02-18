/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roda.roda;

/**
 *
 * @author Vinícius
 */
public class Tema {
    
    String [] temas = new String[1];
    
    public Tema(){
        temas[0] = "Animais";
    }
    
    public String getTema(){
        return temas[0];
    }
}
