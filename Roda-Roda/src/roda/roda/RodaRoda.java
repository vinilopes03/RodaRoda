/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roda.roda;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Vinícius
 */
public class RodaRoda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        Roleta roleta = new Roleta();
        Tema tema = new Tema();
        Palavra palavra = new Palavra();
        Player player = new Player();
        String leitor;
        String respost;
        char resp;
        int roleResp;
        boolean acertou = false;

        
        
        menu.entrarPlayers();
        player.setNome(JOptionPane.showInputDialog(null, "Entre o nome do player"));
        menu.entrarPalavra();
        menu.entrarEtapa();
        
        while(true){
        if(player.getTenta()==3){
            JOptionPane.showMessageDialog(null, "A palavra era -"+palavra.getPalavra()+"-\nVoce perdeu :(");
            System.exit(0);
        }
        leitor = JOptionPane.showInputDialog("Ola "+player.getNome()+" Voce ja gastou: "+player.getTenta()+" tentativas\n"+"\n"+"O tema e: "+tema.getTema()+"\n"+"Voce deseja girar a roleta ou Responder a palavra completa?\n R - para Roleta\n P - para palavra\n S - para sair do jogo");
        resp = leitor.charAt(0);
        
        if(Character.toLowerCase(resp)== 'r'){
            
            roleResp = roleta.girarRoleta();
            respost = roleta.getRoleta(roleResp);
            System.out.println(respost);
            switch(respost){
                case "Perde Tudo":
                //Resetar toda a pontuaÃ§ao do player q estiver jogando
                JOptionPane.showMessageDialog(null,"A roleta selecionou - Perde Tudo - Voce perdeu todos os seus pontos!");
                player.setPontuacao(0);
                break;
            case "Passa a vez":
                // comandos de passar a vez para o proximo player!
                JOptionPane.showMessageDialog(null,"A roleta selecionou - Passa a vez - A vez agora e do proximo player!");
                break;
            case "100 pontos":
               acertou = palavra.adivinhaLetra(JOptionPane.showInputDialog("A roleta selecionou - 100 pontos - acerte a letra para ganhar a pontuacao:"));
               if(acertou){
                   player.ganhaPontos(100);
                   JOptionPane.showMessageDialog(null,("A palavra esta assim:\n")+Arrays.toString(palavra.getPalavraF()));
               }
                else{
                   player.setTenta();
                   JOptionPane.showMessageDialog(null,("Voce errou! Voce ja errou: "+player.getTenta()+" vezes o maximo sao 3 vezes!"));
                }
           
                break;
            case "200 pontos":
               acertou = palavra.adivinhaLetra( JOptionPane.showInputDialog("A roleta selecionou - 200 pontos - acerte a letra para ganhar a pontuacao:"));
               if(acertou){
                   player.ganhaPontos(200);
                   JOptionPane.showMessageDialog(null,("A palavra e:\n")+Arrays.toString(palavra.getPalavraF()));
               }
                else{
                   player.setTenta();
                   JOptionPane.showMessageDialog(null,("Voce errou! Voce ja errou: "+player.getTenta()+" vezes o maximo sao 3 vezes!"));
                }
                break;
            case "400 pontos":
                acertou = palavra.adivinhaLetra(JOptionPane.showInputDialog("A roleta selecionou - 400 pontos - acerte a letra para ganhar a pontuacao:"));
                if(acertou){
                    player.ganhaPontos(400);
                    JOptionPane.showMessageDialog(null,("A palavra e:\n")+Arrays.toString(palavra.getPalavraF()));
                }
                else{
                   player.setTenta();
                   JOptionPane.showMessageDialog(null,("Voce errou! Voce ja errou: "+player.getTenta()+" vezes o maximo sao 3 vezes!"));
                }
                break;
            case "500 pontos":
                acertou = palavra.adivinhaLetra(JOptionPane.showInputDialog("A roleta selecionou - 500 pontos - acerte a letra para ganhar a pontuacao:"));
                if(acertou){
                    player.ganhaPontos(500);
                    JOptionPane.showMessageDialog(null,("A palavra e:\n")+Arrays.toString(palavra.getPalavraF()));
                }
                else{
                   player.setTenta();
                   JOptionPane.showMessageDialog(null,("Voce errou! Voce ja errou: "+player.getTenta()+" vezes o maximo sao 3 vezes!"));
                }
                break;
            case "1000 pontos":
                acertou = palavra.adivinhaLetra(JOptionPane.showInputDialog("A roleta selecionou - 1000 pontos - acerte a letra para ganhar a pontuacao:"));
                if(acertou){
                    player.ganhaPontos(1000);
                    JOptionPane.showMessageDialog(null,("A palavra e:\n")+Arrays.toString(palavra.getPalavraF()));
                }
                else{
                   player.setTenta();
                   JOptionPane.showMessageDialog(null,("Voce errou! Voce ja errou: "+player.getTenta()+" vezes o maximo sao 3 vezes!"));
                }
                break;
                
            default:
                JOptionPane.showMessageDialog(null,"Erro Roleta!","ERROR",ERROR_MESSAGE);
                break;
            }
        String comparador = new String(palavra.getPalavraF());
        if(palavra.adivinhaPalavra(comparador)){
            JOptionPane.showMessageDialog(null,"Parabens!!! Voce ganhou!!!");
            System.exit(0);
        }
                    
        } else if (Character.toLowerCase(resp)=='p'){
 
           if(palavra.adivinhaPalavra(JOptionPane.showInputDialog("Entre com a palavra correta: "))){
                JOptionPane.showMessageDialog(null, "Parabens!!! Voce Ganhou!");
                System.exit(0);
           }
        
            
           else{
                JOptionPane.showMessageDialog(null, "A palavra era -"+palavra.getPalavra()+"-\nVoce perdeu :(");
                System.exit(0);
            } 
        } else if(Character.toLowerCase(resp)=='s'){
            System.exit(0);
        }
        else{
             JOptionPane.showMessageDialog(null, "Opcao invalida","ERRO",ERROR_MESSAGE);
        }
    }
    
    }
}
