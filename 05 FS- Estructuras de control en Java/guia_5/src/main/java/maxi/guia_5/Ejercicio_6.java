 /// aca abajo habia un espacio
package maxi.guia_5;//aca abajo habia un espacio

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        int numero1 = 0, numero2 = 0;

        do {            
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Sumar dos numeros");
            System.out.println("2. Restar dos numeros");
            System.out.println("3. Multiplicar dos numeros");
            System.out.println("4. Dividir dos numeros");
            System.out.println("5. Salir del programa");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();
            
            if(opcion != 5){
                System.out.print("Ingrese el primer numero: ");
                numero1 = leer.nextInt();
                System.out.print("Ingrese el segundo numero: ");
                numero2 = leer.nextInt();
                
            }
            
            switch (opcion) {
                case 1:
                    int suma = numero1 + numero2;
                    System.out.println("La suma de los numeros es: " + suma);
                    break;
                case 2:
                    int resta = numero1 - numero2;
                    System.out.println("La resta de los numeros es: " + resta);
                    break;
                case 3:
                    int multiplicacion = numero1 * numero2;
                    System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
                    break;
                case 4:
                    numero2 = leer.nextInt();
                    if (numero2 != 0) {
                        double division = (double) numero1 / numero2;
                        System.out.println("La division de los numeros es: " + division);
                    } else {
                        System.out.println("No se puede dividir por cero.");
                    }
                    break;
                case 5:
                    System.out.print("Esta seguro que desea salir del programa (S/N)? ");
                    char confirmacion = leer.next().charAt(0);
                    if (Character.toUpperCase(confirmacion) == 'S') {
                        System.out.println("Saliendo del programa...");                       
                    }
                    else{
                        opcion = 0;
                    }
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
                    break;
            }
        } while (opcion != 5);        
    }

}
