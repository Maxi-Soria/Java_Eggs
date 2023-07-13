package maxi.guia_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero entero: ");
        int numero2 = scanner.nextInt();

        int suma = numero1 + numero2;

        System.out.println("La suma de los numeros es: " + suma);
   
    }
    
}
