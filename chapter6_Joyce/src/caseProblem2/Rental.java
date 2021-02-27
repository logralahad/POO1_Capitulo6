/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem2;

/**
 *
 * @author logra
 */
public class Rental {
    
    public final static int MIN_HOUR = 60;
    public final static int RENTA_HORA = 40;
    
    private String contrato;
    private Integer minutos;
    private Integer horas;
    private Integer min_extras;
    private Integer costo;
    
    public Rental(){
        this("A000", 0);
    }
    
    public Rental(String contrato, Integer minutos) {
        this.contrato = contrato;
        this.minutos = minutos;
        this.horas = minutos / 60;
        this.min_extras = this.minutos % 60;
        this.costo = (this.horas * 40) + (this.min_extras / 40) + (this.min_extras % 40);
    }
    
    public String aPagar(){
        return String.format("Contrato: %s\nHoras completas: %d\nMinutos extras: %d\n"
            + "Costo: $%d\n", contrato, horas, min_extras, costo);
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }
    
    public void setMinutos(int min){
        this.minutos = min;
        this.horas = min / 60;
        this.min_extras = min % 60;
        this.costo = (this.horas * 40) + (this.min_extras / 40) + (this.min_extras % 40);
    }

    public String getContrato() {
        return contrato;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getMin_extras() {
        return min_extras;
    }

    public Integer getCosto() {
        return costo;
    }
    
    public static void SammysMotto(){
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S   Sammy's makes it   S");
        System.out.println("S    fun in the sun    S");
        System.out.print("SSSSSSSSSSSSSSSSSSSSSSSS\n\n");
    }
    
    public static Rental largerRental(Rental a1, Rental a2){
        if(a1.getMinutos() > a2.getMinutos()){
            System.out.println("\nRenta 1 mas grande.");
            System.out.println("---------------------");
            return a1;
        }
        else if(a2.getMinutos() > a1.getMinutos()){
            System.out.println("\nRenta 2 mas grande.");
            System.out.println("---------------------");
            return a2;
        }
        else{
            System.out.println("\nRenta de la misma duracion.");
            System.out.println("---------------------");
            return a1;
        }
    }
    
    public static void cupones(Rental r){
        for (int i = 0; i < r.horas; i++) {
            System.out.println("Cupones del 10% de descuento en la proxima renta!");
        }
    }
}
