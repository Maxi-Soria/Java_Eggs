package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_1_y_2 {

    public static void main(String[] args) {
        
        ///PUNTO 1--------------------------------------------------------
        Scanner leer = new Scanner(System.in);
     
        ArrayList<String> razaPero = new ArrayList<String>();
        
        boolean continuar = true;
        do {            
            System.out.print("Ingrese una raza de perro: ");
            String raza = leer.nextLine();
            razaPero.add(raza);
            
            System.out.print("Decea continuar agregando razas S/N? ");
            String opcion = leer.next().toUpperCase();
            leer.nextLine(); 
            System.out.println();
            
            continuar = opcion.equals("N");

        } while (!continuar);
        
        System.out.println("Razas en la lista:");
        for (String raza : razaPero) {
            System.out.println(raza);
        }
        
        ///PUNTO 2-----------------------------------------------------------------
        System.out.println("Ingrese la raza que desea quitar");
        String nombreBorrar = leer.nextLine();
        
        Iterator iterador = razaPero.iterator();
        
        boolean esta = false;
        while (iterador.hasNext()) {
            if(iterador.next().equals(nombreBorrar)){
                iterador.remove();
                esta = true;
            }
            
        }
        
        System.out.print("La raza " + nombreBorrar);
        if(esta){
            System.out.println(" fue quitada de la lista" );
        }else{
            System.out.println(" no se encontraba en la lista ");
        }
        
        ///ordeno la lista
        Collections.sort(razaPero);
        
        for (String raza : razaPero) {
            System.out.println(raza);
        }
        
        
    }
    
}
