package maxi.guia_5_extra;

import java.util.Scanner;

public class Ejercicio_06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de personas: ");
        int cantPersonas = leer.nextInt();

        double sumaEstaturas = 0;
        int bajos = 0;

        for (int i = 1; i <= cantPersonas; i++) {
            System.out.print("Ingrese la estatura de la persona " + i + " (en metros): ");
            double estatura = leer.nextDouble();

            sumaEstaturas += estatura;

            if (estatura < 1.60) {
                bajos++;
            }
        }

        double promedio = sumaEstaturas / cantPersonas;
        double promedioBajos = sumaEstaturas / bajos;

        System.out.println("Promedio de estaturas en general: " + promedio);
        System.out.println("Promedio de estaturas por debajo de 1.60 metros: " + promedioBajos);
    }

}
