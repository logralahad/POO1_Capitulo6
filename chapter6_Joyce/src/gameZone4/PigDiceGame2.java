/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone4;

/**
 *
 * @author logra
 */
public class PigDiceGame2 {
    
    private Die dado1;
    private Die dado2;
    private Integer score;
    private Boolean turno;
    private Integer acumulado;
    
    public PigDiceGame2(){
        this.dado1 = new Die();
        this.dado2 = new Die();
        this.score = 0;
        this.turno = true;
        this.acumulado = 0;
    }
    
    public Integer getScore(){
        return this.score;
    }
    
    public Boolean getTurno(){
        return this.turno;
    }
    
    private void lanzarDados(){
        this.dado1.lanzar();
        this.dado2.lanzar();
    }
    
    public void lanzarHumano(){
        lanzarDados();
        
        if(dado1.getValor() == 1 && dado2.getValor() == 1){
            this.score -= this.acumulado;
            this.turno = false;
        }
        else if(dado1.getValor() != 1 && dado2.getValor() != 1){
            this.score += dado1.getValor() + dado2.getValor();
            this.acumulado += dado1.getValor() + dado2.getValor();
        }
        else{
            this.turno = false;
        }        
    }
    
    public void lanzarComputadora(){
        lanzarDados();
        
        if(dado1.getValor() == 1 && dado2.getValor() == 1){
            this.score -= this.acumulado;
        }
        else if(dado1.getValor() != 1 && dado2.getValor() != 1){
            this.score += dado1.getValor() + dado2.getValor();
            this.acumulado += dado1.getValor() + dado2.getValor();
            if(Math.random() < 0.5){
                this.turno = false;
            }
        }
        else{
            this.turno = false;
        }        
    }
    
    public Integer getValor1(){
        return this.dado1.getValor();
    }
    
    public Integer getValor2(){
        return this.dado2.getValor();
    }
    
    public void decision(Integer opcion){
        if(opcion != 1){
            this.turno = false;
        }
    }
    
    public String resultado(){
        if(this.score >= 100){
            return "ganaste! Bien hecho.";
        }else{
            return "perdiste! Suerte a la proxima.";
        }
    }
    
    public void reset(){
        this.turno = true;
    }
}
