/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone3;

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
        TwoDice3 juego = new TwoDice3();
        Scanner sc = new Scanner(System.in);
        
        while(juego.getIntentos() < 3 && juego.getAdivinado() == false){
            System.out.print("Adivina la suma: ");
            juego.adivinar(sc.nextInt());
            System.out.println("Tiras los dados de nuevo...\n");
            juego.lanzar();
        }
        
        juego.resultado();
        
    }
    
}
