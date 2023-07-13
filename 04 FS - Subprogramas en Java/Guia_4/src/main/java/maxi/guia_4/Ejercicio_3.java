
package maxi.guia_4;

import java.util.Scanner;


public class Ejercicio_3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros a convertir: ");
        double euros = leer.nextDouble();
        leer.nextLine();

        System.out.print("Ingrese la moneda a la que desea convertir (l-libras/d-dolares/y-yenes): ");
        String moneda = leer.nextLine();

        convertirMoneda(euros, moneda);
    }
    
    public static void convertirMoneda(double euros, String moneda) {
        double cambio = 0.0;
        String mensaje = "";

        switch (moneda.toLowerCase()) {
            case "l":
                cambio = euros * 0.86;
                mensaje = euros + " euros equivale a " + cambio + " libras.";
                break;
            case "d":
                cambio = euros * 1.28611;
                mensaje = euros + " euros equivale a " + cambio + " dolares.";
                break;
            case "y":
                cambio = euros * 129.852;
                mensaje = euros + " euros equivale a " + cambio + " yenes.";
                break;
            default:
                mensaje = "Moneda no valida. Por favor, ingrese una de las opciones validas: l, d o y.";
        }

        System.out.println(mensaje);
    }
}
