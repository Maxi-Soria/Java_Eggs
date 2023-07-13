package maxi.guia_1;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        String mayusculas = frase.toUpperCase();
        System.out.println("Frase en mayusculas: " + mayusculas);

        String minusculas = frase.toLowerCase();
        System.out.println("Frase en minusculas: " + minusculas);
    }
    
}
