package maxi.guia_5_extra;

import java.util.Scanner;

public class Ejercicio_04 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un numero entre 1 y 10: ");
        int numero = leer.nextInt();

        String numeroRomano = "";

        switch (numero) {
            case 1:
                numeroRomano = "I";
                break;
            case 2:
                numeroRomano = "II";
                break;
            case 3:
                numeroRomano = "III";
                break;
            case 4:
                numeroRomano = "IV";
                break;
            case 5:
                numeroRomano = "V";
                break;
            case 6:
                numeroRomano = "VI";
                break;
            case 7:
                numeroRomano = "VII";
                break;
            case 8:
                numeroRomano = "VIII";
                break;
            case 9:
                numeroRomano = "IX";
                break;
            case 10:
                numeroRomano = "X";
                break;
            default:
                System.out.println("El numero ingresado no es valido.");
                return;
        }

        System.out.println("El numero romano equivalente es: " + numeroRomano);
    }

}
