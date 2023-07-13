package maxi.guia_4;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el numero que decea saber si es primo: ");
        int numero = leer.nextInt();
        
        System.out.println("El numero " + numero + " es primo: " + esPrimo(numero) );
        
    }
    public static boolean esPrimo(int n){        
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
    return true;
    }
}
