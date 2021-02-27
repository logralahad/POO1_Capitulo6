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
public class Pregunta {

    private String pregunta;
    private Inciso[] incisos;
    private Integer indice;

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
        this.incisos = new Inciso[4];
        this.indice = 0;
    }

    public void setInciso(Inciso inciso) {
        if (this.indice < 4) {
            this.incisos[indice] = inciso;
        }
        indice++;
    }
    
    public Boolean getCorrecto(Integer inciso){
        return incisos[inciso].getCorrecto();
    }
    
    @Override
    public String toString(){
        return String.format("%s\n(1)%s\n(2)%s\n(3)%s\n(4)%s\n", this.pregunta, incisos[0].getTexto(),
                incisos[1].getTexto(),incisos[2].getTexto(),incisos[3].getTexto()); 
    }
}
