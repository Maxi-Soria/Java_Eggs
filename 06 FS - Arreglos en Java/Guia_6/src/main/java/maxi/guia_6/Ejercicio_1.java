package maxi.guia_6;

public class Ejercicio_1 {

    public static void main(String[] args) {
        int[] vectorEnteros = new int[100];
        
        for (int i = 0; i < vectorEnteros.length; i++) {
            vectorEnteros[i] = i+1;           
        }
        
        for (int i = vectorEnteros.length-1; i >= 0; i--) {
            System.out.println(vectorEnteros[i]);
            
        }
    }

}
