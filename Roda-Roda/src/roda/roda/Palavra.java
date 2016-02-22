/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roda.roda;

import java.util.Scanner;

/**
 *
 * @author Vinícius
 */
public class Palavra {
    private String [][] palavras = new String[1][1];
    boolean stillPlay = true;
    Scanner scanner = new Scanner(System.in);
    char recebido;
    char [] palavraF;
    boolean adivinhou;
    
    
    public Palavra(){
    palavras[0][0] = "cachorro";
    palavraF = new char[palavras[0][0].length()];
    adivinhou = false;
    
    }
    
    public String getPalavra(){
       
        return palavras[0][0];
        
    }
    public boolean adivinhaLetra(String recebido){
        adivinhou = false;
        
                
        for (int i = 0; i < palavras[0][0].length(); i++) {
            
            if (palavras[0][0].charAt(i) == recebido.charAt(0)) {
                palavraF[i] = recebido.charAt(0);
                adivinhou = true;
            }
        }
        return adivinhou;
    }
    
    public boolean adivinhaPalavra(String recebidoStri){
 
        
        return recebidoStri.equals(palavras[0][0]);
                  
    }
    public char getCharF(){
        return recebido;
    }
    
    public char[] getPalavraF(){
        return palavraF;
    }
} 
