/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roda.roda;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Vinícius
 */
public class Menu {
    int quantPlayer, quantPalavra, quantEtapa;
    String Leitor;
    boolean verifier = true;
    
    public Menu(){
        JOptionPane.showMessageDialog(null, "Bem-Vindo ao Roda Roda");
    }
    
    public void entrarPlayers(){
        
        while(verifier){
            Leitor = JOptionPane.showInputDialog(null,"Digite a quantidade de players que irão jogar! entre 1-3");
            quantPlayer = Integer.parseInt(Leitor);
        
        if (quantPlayer != 1){
            JOptionPane.showMessageDialog(null,"Quantidade de players invalida!","ERRO",ERROR_MESSAGE);
        }
        else verifier = false;
        }
        
        verifier = true;
    }
    
    public void entrarPalavra(){
        
        while(verifier){
            Leitor = JOptionPane.showInputDialog(null, "Entre com a quantidade de palavras por etapa! 1-3");
            quantPalavra = Integer.parseInt(Leitor);
            
            if (quantPalavra != 1){
            JOptionPane.showMessageDialog(null,"Quantidade de palavras invalida!","ERRO",ERROR_MESSAGE);
        }
        else verifier = false;
        }
        
        verifier = true;
        }
    public void entrarEtapa(){
        
        while(verifier){
            Leitor = JOptionPane.showInputDialog(null, "Entre com a quantidade de palavras por etapa! 1-3");
            quantEtapa = Integer.parseInt(Leitor);
            
            if (quantEtapa != 1){
            JOptionPane.showMessageDialog(null,"Quantidade de etapas invalida!","ERRO",ERROR_MESSAGE);
        }
        else verifier = false;
        }
        
        verifier = true;
        }
        
    }

