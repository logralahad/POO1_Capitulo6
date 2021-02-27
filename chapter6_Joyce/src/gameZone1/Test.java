/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

/**
 *
 * @author logra
 */
public class Test {
    public static void main(String[] args) {
        Quiz cuestionario = new Quiz();

        cuestionario.addPregunta(new Pregunta("Cuantos capitulos de Flash hay"));
        cuestionario.addInciso(1, new Inciso("500", true));
        cuestionario.addInciso(1, new Inciso("1500", false));
        cuestionario.addInciso(1, new Inciso("100", false));
        cuestionario.addInciso(1, new Inciso("150", false));
        
        cuestionario.addPregunta(new Pregunta("Si le sabe o no?"));
        cuestionario.addInciso(2, new Inciso("si", false));
        cuestionario.addInciso(2, new Inciso("no", false));
        cuestionario.addInciso(2, new Inciso("tal vez", true));
        cuestionario.addInciso(2, new Inciso("que haces aqui", false));
        
        cuestionario.addPregunta(new Pregunta("Mejor jugador"));
        cuestionario.addInciso(3, new Inciso("Messi", false));
        cuestionario.addInciso(3, new Inciso("Maradona", false));
        cuestionario.addInciso(3, new Inciso("CR7", false));
        cuestionario.addInciso(3, new Inciso("Pele", true));

        cuestionario.responder();
        System.out.println(String.format("Calificacion: %.2f", cuestionario.getScore()));
    }
}
