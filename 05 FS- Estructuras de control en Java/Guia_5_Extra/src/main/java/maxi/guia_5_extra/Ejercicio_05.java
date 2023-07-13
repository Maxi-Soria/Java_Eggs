package maxi.guia_5_extra;

import java.util.Scanner;

public class Ejercicio_05 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la clase de socio (A, B o C): ");
        char claseSocio = leer.next().charAt(0);

        System.out.print("Ingrese el costo del tratamiento: ");
        double costoTratamiento = leer.nextDouble();

        double importeAPagar = 0;

        switch (claseSocio) {
            case 'A':
                importeAPagar = costoTratamiento * 0.5;
                break;
            case 'B':
                importeAPagar = costoTratamiento * 0.65;
                break;
            case 'C':
                importeAPagar = costoTratamiento;
                break;
            default:
                System.out.println("La clase de socio ingresada no es valida.");
                return;
        }

        System.out.println("El importe en efectivo a pagar es: " + importeAPagar);        
    }

}
