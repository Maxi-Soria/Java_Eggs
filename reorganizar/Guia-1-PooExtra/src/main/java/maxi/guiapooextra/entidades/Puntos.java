package maxi.guiapooextra.entidades;

import java.util.Scanner;

/**
 Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
 * @author MAXI
 */
public class Puntos {
    private double x1, y1, x2, y2;

    public void crearPuntos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la coordenada x del primer punto: ");
        x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del primer punto: ");
        y1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada x del segundo punto: ");
        x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del segundo punto: ");
        y2 = scanner.nextDouble();
    }
    
    public double calcularDistancia(){
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distancia;
    }
}
