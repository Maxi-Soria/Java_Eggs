package maxi.guia_5_extra;

public class Ejercicio_01 {

    public static void main(String[] args) {
        int tiempoIngresado = 1600;

        int dias = tiempoIngresado / 60 / 24;

        int horas = (tiempoIngresado / 60) % 24;

        // Imprimir el resultado
        System.out.println(tiempoIngresado + " minutos equivalen a " + dias + " día(s), " + horas + " hora(s).");
    }
        

}
