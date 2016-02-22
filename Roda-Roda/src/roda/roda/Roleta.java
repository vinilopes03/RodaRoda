/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roda.roda;
import java.util.Random;  

import java.util.Arrays;

/**
 *
 * @author Vinícius
 */
public class Roleta {
    
    private String divisoes[] = {"Perde Tudo", "Passa a vez", "100 pontos", "200 pontos", "400 pontos", "500 pontos", "1000 pontos"};
    private String [] fullRoleta = new String[20];
    Random rnd = new Random();

    public Roleta(){
        
        int contador, contador2,aux=0;
        
        for (contador = 0; contador<4; contador++){
           
            for(contador2 = 0; contador2<divisoes.length; contador2++){
                if(contador>=2 && ((contador2==0)||(contador2==1)||(contador2==5)||(contador2==6))){
                    aux-=1;
                }
                else{
                fullRoleta[contador2+aux] = divisoes[contador2];
                }
            }
                aux+=7;
           
       }
    }
       public int girarRoleta(){
           int randomico;
           randomico = rnd.nextInt(fullRoleta.length-1);
           
           return randomico;
       }
       public String getRoleta(int index){
           
           return fullRoleta[index];
       }
       public void escreverRoleta(){
           System.out.println(Arrays.toString(fullRoleta));
           
       }
    
}
