/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone3;

/**
 *
 * @author logra
 */
public class TwoDice3 {
    
    private Die dado1;
    private Die dado2;
    private Integer score;
    private Integer intentos;
    private Boolean adivinado;
    
    public TwoDice3(){
        this.dado1 = new Die();
        this.dado2 = new Die();
        this.score = this.dado1.getValor() + this.dado2.getValor();
        this.intentos = 0;
        this.adivinado = false;
    }
    
    public void lanzar(){
        this.dado1.lanzar();
        this.dado2.lanzar();
    }
    
    public Integer getScore(){
        return this.score;
    }
    
    public Boolean getAdivinado(){
        return this.adivinado;
    }
    
    public Integer getIntentos(){
        return this.intentos;
    }
    
    public void adivinar(Integer apuesta){
        if(apuesta != this.score){
            System.out.println("Fallaste!");
            this.intentos++;    
        }
        else{
            this.adivinado = true;
        }
    }
    
    public void resultado(){
        if(this.adivinado == false){
            System.out.println("Perdiste, ya no te quedan mas turnos");
        }else{
            System.out.println("Felicidades, adivinaste!");
        }
    }
 
}
