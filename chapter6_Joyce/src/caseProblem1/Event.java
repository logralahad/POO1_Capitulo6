/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

/**
 *
 * @author logra
 */
public class Event {
    
    public final static int ALTO_PRECIO = 35;
    public final static int BAJO_PRECIO = 32;
    public final static int TIPO_EVENTO = 50;
    
    private String evento;
    private Integer num_inv;
    private Integer costo;
    private Integer costo_por_persona;
    private Boolean tam_evento;
    
    public Event(){
        this("A000", 0);
    }

    public Event(String evento, Integer num_inv) {
        this.evento = evento;
        this.num_inv = num_inv;
        setTam_evento();
        this.costo_por_persona = this.costo / this.num_inv;
    }

    public Boolean getTam_evento() {
        return tam_evento;
    }

    private void setTam_evento() {
        if(num_inv >= TIPO_EVENTO){
            this.costo = num_inv * BAJO_PRECIO;
            this.tam_evento = true;
        }else{
            this.costo = num_inv * ALTO_PRECIO;
            this.tam_evento = false;
        }
    }
    
    public void setEvento(String evento) {
        this.evento = evento;
    }

    public void setNum_inv(Integer num_inv) {
        this.num_inv = num_inv;
        setTam_evento();
    }

    public String getEvento() {
        return evento;
    }

    public Integer getNum_inv() {
        return num_inv;
    }

    public Integer getCosto() {
        return costo;
    }

    public Integer getCosto_por_persona() {
        return costo / num_inv;
    }
    
    public Boolean isLargeEvent(){
        return tam_evento;
    }
    
    public static void CarlysMotto(){
        System.out.println("\n*************************");
        System.out.println("*   Carly’s makes the   *");
        System.out.println("*    food that makes    *");
        System.out.println("*      it a party!      *");
        System.out.print("*************************\n");
    }
    
    public String eCosto(){
        String s1 = String.format("Evento: %s\nNum. de invitados: %d\nPrecio por invitado: $%d\n", 
                this.evento, this.num_inv, this.costo_por_persona);
        String s2 = String.format("Evento grande: %b\nCosto total: $%d", isLargeEvent(), this.costo);
        
        return String.format("\n%s%s", s1, s2);
    }
    
    public static Event largerEvent(Event a1, Event a2){
        if(a1.getNum_inv() > a2.getNum_inv()){
            System.out.println("\nEvento 1 mas grande.");
            System.out.println("---------------------");
            return a1;
        }
        else if(a2.getNum_inv() > a1.getNum_inv()){
            System.out.println("\nEvento 2 mas grande.");
            System.out.println("---------------------");
            return a2;
        }
        else{
            System.out.println("\nEventos del mismo tamanio.");
            System.out.println("---------------------");
            return a1;
        }
    }
    
    public static void invitaciones(Event e){
        for (int i = 0; i < e.getNum_inv(); i++) {
            System.out.println("¡Por favor, ven a mi evento!");
        }
    }
}
