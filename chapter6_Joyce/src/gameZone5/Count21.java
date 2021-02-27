/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone5;

/**
 *
 * @author logra
 */
public class Count21 {
    
    private Integer total;
    private Boolean limite;
    
    public Count21(){
        this.total = 0;
        this.limite = false;
    }
    
    public void sumar(Integer numero){
        this.total += numero;
    }
    
    public Integer getTotal(){
        return this.total;
    }
    
    public Boolean getLimite(){
        return this.limite;
    }
    
    public void turnoPc(){
        int faltante = 21 - this.total;
        
        if(faltante > 3){
            sumar(3);
        }else{
            sumar(faltante);
        }
    }
    
    public Boolean turnoJugador(Integer numero){
        if(numero <= 3 && numero >= 1){
            sumar(numero);
            if(this.total >= 22){
                this.limite = true;
            }
            return true;
        }else{
            return false;
        }
    }
    
    public String resultado(){
        return "Jugador perdio, la computadora gana!";
    }
}
