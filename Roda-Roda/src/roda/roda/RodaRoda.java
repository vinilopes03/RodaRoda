/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roda.roda;
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
        Scanner scanner = new Scanner( System.in );
        String leitor;
        char resp;
        int roleResp;
        
        menu.entrarPlayers();
        player.setNome(JOptionPane.showInputDialog(null, "Entre o nome do player"));
        menu.entrarPalavra();
        menu.entrarEtapa();
        
        System.out.println("Voce deseja girar a roleta ou Responder a palavra completa?\n R - para Roleta\n P - para palavra");
        leitor = scanner.nextLine();
        resp = leitor.charAt(0);
        
        if(resp== 'r' || resp == 'R'){
            
            roleResp = roleta.girarRoleta();
                    
        } else {
            
        }
 
        
        
        
        
    }
    
}
