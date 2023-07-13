package maxi.guia_5;

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase o palabra: ");
        String cantLetras = leer.nextLine();
        
        if (cantLetras.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

}
