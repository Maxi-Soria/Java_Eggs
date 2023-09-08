
package servicios;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCantante {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void cargarCantantes(ArrayList<CantanteFamoso> listaCantantes){
        boolean continuar = true;
        
        do {
            System.out.print("Ingrese el nombre del cantante");
            String nomb = leer.next();
            System.out.print("Ingrese el nombre del disco");
            String disco = leer.next();
            
            listaCantantes.add(new CantanteFamoso(nomb,disco));
            
            System.out.print("Desea seguir cargando s/n?: ");
            String opc = leer.next();
            if(opc.equalsIgnoreCase("n")){continuar = false;}
            
        } while (continuar);
        System.out.println();
    }
    
    public void mostrarLista(ArrayList<CantanteFamoso> listaCantantes){
        
        System.out.println("CANTANTE" + "                     " + "DISCO MÁS VENDIDO");
        System.out.println("--------------------------------------------------");
        for (CantanteFamoso cantante : listaCantantes) {
            System.out.printf("%-30s%-30s%n", cantante.getNombre(), cantante.getDiscoConMasVentas());
        }
        System.out.println();
    }

}
