/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone4;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PigDiceGame humano = new PigDiceGame();
        PigDiceGame pc = new PigDiceGame();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inicia el juego.");
        while(humano.getScore() < 100 && pc.getScore() < 100){
            
            do {
                System.out.println("\nSe tiran los dados de Humano...");
                humano.lanzarHumano();
                System.out.println(String.format("Dado1: %d Dado2: %d", humano.getValor1(), humano.getValor2()));
                
                if(humano.getTurno() == true){
                    System.out.print("¿Quiere continuar su turno? [1]Si [0]No: ");
                    humano.decision(sc.nextInt());
                }
                
            } while (humano.getTurno() == true && humano.getScore() < 100);
            
            do {
                System.out.println("\nSe tiran los dados de PC...");
                pc.lanzarComputadora();
                System.out.println(String.format("Dado1: %d Dado2: %d\n", pc.getValor1(), pc.getValor2()));
            } while (pc.getTurno() == true && pc.getScore() < 100);
            
            humano.reset();
            pc.reset();
        }
        
        System.out.println(String.format("Humano: %d puntos, %s", humano.getScore(), humano.resultado()));
        System.out.println(String.format("PC: %d puntos, %s", pc.getScore(), pc.resultado()));
        
    }
    
}
