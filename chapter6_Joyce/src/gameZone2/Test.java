/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;

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
        RandomGuess2 computadora = new RandomGuess2();
        Scanner sc = new Scanner(System.in);
        
        while(computadora.getAdivinado() == false){
            System.out.print("Digite un numero: ");
            computadora.intento(sc.nextInt());
        }
        
        System.out.println(computadora.victoria());
    }
}
