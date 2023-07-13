package maxi.guia_5;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = leer.nextLine();
        
        if (frase.equals("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }

}
