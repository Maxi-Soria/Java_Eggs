package maxi.guia_5_extra;

import static java.time.Clock.system;
import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de hasta 9 digitosa descompaner: " );        
        int numero = leer.nextInt();
        
        int contadorDigitos = 0;
         
        while (numero >= 1) {            
            numero /= 10; 
            contadorDigitos++;
            
        }
        
        System.out.println("Cantidad de digitos: " + contadorDigitos);
        

    }

}
