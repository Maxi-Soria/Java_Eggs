package maxi.guia_6_extra;

import java.util.Random;

public class Ejercicio_3 {

    public static void main(String[] args) {
        int N = 10; // Tamaño del vector
        int[] vector = new int[N];

        llenarVectorAleatorio(vector);
        imprimirVector(vector);
    }

    public static void llenarVectorAleatorio(int[] vector) {
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(100);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println();
    }
}
