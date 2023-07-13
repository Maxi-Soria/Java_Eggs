package maxi.guia_4;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.println("Elija la operacion a realizar:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                double suma = sumar(numero1, numero2);
                System.out.println("La suma es: " + suma);
                break;
            case 2:
                double resta = restar(numero1, numero2);
                System.out.println("La resta es: " + resta);
                break;
            case 3:
                double multiplicacion = multiplicar(numero1, numero2);
                System.out.println("La multiplicacion es: " + multiplicacion);
                break;
            case 4:
                double division = dividir(numero1, numero2);
                System.out.println("La division es: " + division);
                break;
            default:
                System.out.println("Opción no valida");
        }
        
        
    }
    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;
    }    
}
