/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone5;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Count21 game = new Count21();
        Scanner sc = new Scanner(System.in);
        
        while(game.getLimite() == false){
            game.turnoPc();
            System.out.print("Digite un numero entre 1 y 3: ");
            while (game.turnoJugador(sc.nextInt()) == false){
                System.out.print("Solo un numero entre 1 y 3: ");
            } 
        }
        
        System.out.println(String.format("\nTotal: %d\n%s", game.getTotal(), game.resultado()));
    }
    
}
