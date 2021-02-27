/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone2;
import java.util.Random;

/**
 *
 * @author logra
 */
public class RandomGuess2 {
    
    private Integer numero;
    private Boolean adivinado;
    private Integer intentos;
    
    public RandomGuess2(){
        lanzar();
        this.adivinado = false;
        this.intentos = 0;
    }
    
    private void lanzar(){
        Random rd = new Random();
        this.numero = rd.nextInt(100) + 1;
    }

    public void intento(Integer num_usuario){
        if(num_usuario > this.numero){
            System.out.println("Te pasaste.\n");
            this.intentos++;
        }
        else if(num_usuario < this.numero){
            System.out.println("Te falto.\n");
            this.intentos++;
        }
        else{
            this.adivinado = true;
        }
    }
       
    public Boolean getAdivinado(){
        return this.adivinado;
    }  
    
    public Integer getIntentos(){
        return this.intentos;
    }
    
    public String victoria(){
        return String.format("El numero era %d\nGanaste, te tomo %d intentos", this.numero, this.intentos);
    }
    
}
