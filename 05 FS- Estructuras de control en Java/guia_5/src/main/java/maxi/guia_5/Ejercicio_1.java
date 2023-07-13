package maxi.guia_5;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = leer.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
    }

}
