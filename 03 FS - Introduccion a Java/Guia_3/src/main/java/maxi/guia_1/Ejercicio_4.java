package maxi.guia_1;

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 32 + (9 * celsius / 5);

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);        
    }
    
}
