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
public class Palavra {
    String [][] palavras = new String[1][1];
    
    public Palavra(){
    palavras[0][0] = "Cachorro";
    }
    
    public String getPalavra(){
       
        return palavras[0][0];
    }
}
