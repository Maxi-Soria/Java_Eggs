package maxi.guia_4;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        pedirYMostrarDatos();
        
        
        
    }
    public static void pedirYMostrarDatos(){
        Scanner leer = new Scanner(System.in);
        String opcion = "Si";

        while (!opcion.equalsIgnoreCase("No")) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = leer.nextLine();

            System.out.print("Ingrese la edad de la persona: ");
            int edad = leer.nextInt();
            leer.nextLine(); 

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);

            if (edad >= 18) {
                System.out.println("Es mayor de edad.");
            } else {
                System.out.println("Es menor de edad.");
            }

            System.out.print("¿Desea ingresar otra persona? (Si/No): ");
            opcion = leer.nextLine();
        }
    }
}
