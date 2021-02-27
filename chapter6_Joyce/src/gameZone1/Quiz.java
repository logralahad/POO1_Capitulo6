/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author logra
 */
public class Quiz {

    private ArrayList<Pregunta> quiz;
    private Integer aciertos;
    private Double score;

    public Quiz() {
        this.quiz = new ArrayList<>();
        this.aciertos = 0;
        this.score = 0.0;
    }
    
    public Double getScore(){
        return this.score;
    }

    public void addPregunta(Pregunta pregunta) {
        quiz.add(pregunta);
    }

    public void addInciso(Integer num_pregunta, Inciso inciso) {
        Pregunta pregunta = quiz.get(num_pregunta - 1);
        pregunta.setInciso(inciso);
        quiz.set(num_pregunta - 1, pregunta);

    }

    public void responder() {
        Scanner sc = new Scanner(System.in);
        
        for (int j = 0; j < this.quiz.size(); j++) {
            Pregunta pr = quiz.get(j);
            System.out.print(String.format("%sRespuesta: ", pr.toString()));
            if(pr.getCorrecto(sc.nextInt() - 1)){
                System.out.println("Correcto.\n");
                this.aciertos++;
            }
            else{
                System.out.println("Incorrecto.\n");
            }
            quiz.set(j, pr);
        }
        
        this.score = ((double)this.aciertos / quiz.size()) * 100;
    }

}
