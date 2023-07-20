package maxi.guia_6_extra;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int  TAM = 10;
        int[] vector = new int[TAM];

        System.out.println("Ingrese los elementos del vector:");
        int suma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = leer.nextInt();
            suma+=vector[i];
        }

        System.out.println("La suma de los elementos del vector es: " + suma);
       
    }

}
