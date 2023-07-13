package maxi.guia_5;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el valor limite positivo: ");
        int limite = leer.nextInt();

        int suma = 0;
        int numero;

        do {
            System.out.print("Ingrese un numero: ");
            numero = leer.nextInt();
            suma += numero;
        } while (suma <= limite);

        System.out.println("La suma de los numeros supero el limite.");
        System.out.println("Suma total: " + suma);        
    }

}
