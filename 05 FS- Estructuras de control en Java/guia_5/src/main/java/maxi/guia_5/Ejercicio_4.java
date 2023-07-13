package maxi.guia_5;//aca abajo habia un espacio

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una frase o palabra: ");
        String texto = leer.nextLine();
        
        if (texto.substring(0, 1).equals("A")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

    }

}
