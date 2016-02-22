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
public class Player {
    
    private String nome;
    private int pontuacao;
    private int tentativa;
    
    public Player(){
        tentativa = 0;
        pontuacao = 0;
    };
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPontuacao(int pontos){
        this.pontuacao = pontos;
    }
    public void ganhaPontos(int pontos){
        this.pontuacao += pontos;
    }
    public int getTenta(){
        return tentativa;
    }
    public void setTenta(){
        tentativa+=1;
    }
    
        public int getPontuacao(){
        return pontuacao;
    }
    
    
    
}
