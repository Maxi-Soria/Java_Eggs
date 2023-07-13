package maxi.guia_5_extra;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de familias: ");
        int cantidadFamilias = leer.nextInt();

        int totalHijos = 0;
        int totalEdades = 0;

        for (int i = 1; i <= cantidadFamilias; i++) {
            System.out.print("Ingrese la cantidad de hijos de la familia " + i + ": ");
            int cantidadHijos = leer.nextInt();

            for (int j = 1; j <= cantidadHijos; j++) {
                System.out.print("Ingrese la edad del hijo " + j + " de la familia " + i + ": ");
                int edadHijo = leer.nextInt();

                totalHijos++;
                totalEdades += edadHijo;
            }
        }

        double mediaEdad = (double) totalEdades / totalHijos;
        System.out.println("La media de edad de los hijos de todas las familias es: " + mediaEdad);
    }

}
