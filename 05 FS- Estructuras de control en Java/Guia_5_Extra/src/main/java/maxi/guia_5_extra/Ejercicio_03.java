package maxi.guia_5_extra;

import java.util.Scanner;

public class Ejercicio_03 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una letra: ");
        String l = leer.nextLine();
        l = l.toLowerCase();
        if (l.equals("a") || l.equals("e") || l.equals("i") || l.equals("o") || l.equals("u")){
                System.out.println("La letra ingresada es una vocal.");
            } else {
                System.out.println("La letra ingresada no es una vocal.");
            }
    }
}
