
package servicios;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiciosLista {

    public void cargarNumeros(ArrayList<Integer> lista){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num;
        do {            
            System.out.print("Ingrese un numero para la lista: ");
            num = leer.nextInt(); 
            if(num != -99){lista.add(num);}
            
        } while ( num != -99); 
        System.out.println();
    }
    
    public void mostrarResultados(ArrayList<Integer> lista){
        Integer cont = 0;
        Integer suma = 0;
        for (Integer num : lista) {
            cont++;
            suma += num;
            System.out.print(num + " ");
        }
        System.out.println();
        
        System.out.println("La cantida de elementos en la lista es: " + cont);
        System.out.println("La suma de los elementos de la lista es: " + suma);
        if(cont > 0){
            double prom = suma/cont;            
            System.out.println("El promedio es: " + prom);
        }
        else{System.out.println("No hay elementos en la lista");}
        
        System.out.println();
    }
    

}
