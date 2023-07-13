package maxi.guia_5_extra;

public class Ejercicio_12 {

    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    String digito1 = (i == 3) ? "E" : String.valueOf(i);
                    String digito2 = (j == 3) ? "E" : String.valueOf(j);
                    String digito3 = (k == 3) ? "E" : String.valueOf(k);
                    System.out.println(digito1 + "-" + digito2 + "-" + digito3);
                }
            }
        }
    }

}
