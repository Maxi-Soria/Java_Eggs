package maxi.guia_5;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int lecturasCorrectas = 0;
        int lecturasIncorrectas = 0;

        System.out.println("Simulador de dispositivo RS232");
        System.out.println("Ingrese las cadenas:");
        String cadena = leer.nextLine();

        while (!cadena.equals("&&&&&")) {

            if (cadena.length() == 5 && cadena.charAt(0) == 'X' && cadena.charAt(4) == 'O') {
                lecturasCorrectas++;
            } else {
                lecturasIncorrectas++;
            }
            
            System.out.println("Ingrese las cadenas (FDE para finalizar):");
            cadena = leer.nextLine();
        }

        System.out.println("Informe:");
        System.out.println("Lecturas correctas: " + lecturasCorrectas);
        System.out.println("Lecturas incorrectas: " + lecturasIncorrectas);
    }

}
