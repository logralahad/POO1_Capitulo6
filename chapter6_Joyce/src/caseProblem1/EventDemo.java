/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseProblem1;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class EventDemo {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int inv;
        Event[] eventos = new Event[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Nombre del evento " + (i + 1) + ": ");
            String name = sc.nextLine();

            do {
                System.out.print("Numero de invitados [5-100]: ");
                inv = sc.nextInt();
                
            } while (inv < 5 || inv > 100);
            sc.nextLine();
            System.out.println("");
            
            
            Event e1 = new Event(name, inv);
            eventos[i] = e1;
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(eventos[i].eCosto());
            Event.CarlysMotto();
        }
        
        Event p = Event.largerEvent(eventos[0], eventos[1]);
        System.out.println(p.eCosto());
        
        Event q = Event.largerEvent(eventos[1], eventos[2]);
        System.out.println(q.eCosto());
        
        Event r = Event.largerEvent(eventos[0], eventos[2]);
        System.out.println(r.eCosto() + "\n");
        
        Event.invitaciones(eventos[0]);
        
    }
    
}
