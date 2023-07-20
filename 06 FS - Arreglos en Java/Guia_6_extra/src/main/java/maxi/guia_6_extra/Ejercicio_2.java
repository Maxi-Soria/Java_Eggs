package maxi.guia_6_extra;

public class Ejercicio_2 {

    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {1, 2, 3, 4, 6};

        boolean sonIguales = verificarVectoresIguales(vector1, vector2);

        if (sonIguales) {
            System.out.println("Los vectores son iguales.");
        } else {
            System.out.println("Los vectores NO son iguales.");
        }
    }

    public static boolean verificarVectoresIguales(int[] vector1, int[] vector2) {
        if (vector1.length != vector2.length) {
            return false;
        }

        for (int i = 0; i < vector1.length; i++) {
            if (vector1[i] != vector2[i]) {
                return false;
            }
        }

        return true;
    }
}
