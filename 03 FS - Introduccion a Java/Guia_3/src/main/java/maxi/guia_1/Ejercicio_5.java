package maxi.guia_1;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        int doble = numero * 2;
        System.out.println("El doble del número es: " + doble);

        int triple = numero * 3;
        System.out.println("El triple del número es: " + triple);

        double raizCuadrada = Math.sqrt(numero);
        System.out.println("La raíz cuadrada del número es: " + raizCuadrada);
    }
    
}
