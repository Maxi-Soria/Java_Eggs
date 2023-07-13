package maxi.guia_5_extra;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1 = (int)(Math.random()*10+1);
        int num2 = (int)(Math.random()*10+1);
        
        int resultado = num1*num2, opcion;
        
        do{
            System.out.println("Adivine el numero: ");
            opcion = leer.nextInt();
            
        } while( opcion != resultado);
    }

}
