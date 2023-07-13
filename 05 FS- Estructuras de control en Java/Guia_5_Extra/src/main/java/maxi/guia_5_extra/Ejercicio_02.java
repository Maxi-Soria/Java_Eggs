package maxi.guia_5_extra;

public class Ejercicio_02 {

    public static void main(String[] args) {
        int A = 1, B = 2, C = 3, D = 4;

        System.out.println("Valores iniciales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);

        int aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;

        System.out.println("Valores finales:");
        System.out.println("A: " + A);
        System.out.println("B: " + B);
        System.out.println("C: " + C);
        System.out.println("D: " + D);
    }

}
