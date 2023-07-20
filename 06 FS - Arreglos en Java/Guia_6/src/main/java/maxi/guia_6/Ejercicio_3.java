package maxi.guia_6;

public class Ejercicio_3 {

    public static void main(String[] args) {
        
        int[] vector = new int[100000];
        int[] vecCont = new int[5];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random()*99999)+1;
            int cantDigitos = String.valueOf(vector[i]).length();
            vecCont[cantDigitos-1]++;
        }
        System.out.println("Numeros con cantida de digitos 1: " + vecCont[0]);
        System.out.println("Numeros con cantida de digitos 2: " + vecCont[1]);
        System.out.println("Numeros con cantida de digitos 3: " + vecCont[2]);
        System.out.println("Numeros con cantida de digitos 4: " + vecCont[3]);
        System.out.println("Numeros con cantida de digitos 5: " + vecCont[4]);
        
    }

}
