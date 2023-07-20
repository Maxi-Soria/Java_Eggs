package maxi.guia_6;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del vector: ");
        int N = leer.nextInt();
        
        int[] vector = new int[N];
       
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*100)+1;
        }
        
        System.out.print("Ingrese el número a buscar: ");
        int numeroBuscado = leer.nextInt();
        
        boolean encontrado = false;
        int posicion = -1;
        int repeticiones = 0;
        
        // Buscar el número en el vector
        for (int i = 0; i < vector.length-1; i++) {
            if (vector[i] == numeroBuscado) {
                if (!encontrado) {
                    posicion = i;
                    encontrado = true;
                }
                repeticiones++;
            }
        }
        
        if (encontrado) {
            System.out.println("El numero " + numeroBuscado + " se encuentra en la posicion " + posicion + " del vector y esta repetido " + repeticiones + " veces.");
        }else{
            System.out.println("El numero no esta en el vector.");
        }
    }
}
