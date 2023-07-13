package maxi.guia_5_extra;

import java.util.Scanner;

public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese la altura de la escalera: ");
        int altura = leer.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
