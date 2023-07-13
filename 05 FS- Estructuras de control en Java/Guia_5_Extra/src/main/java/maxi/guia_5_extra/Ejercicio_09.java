package maxi.guia_5_extra;

public class Ejercicio_09 {

    public static void main(String[] args) {
        int dividendo = 50, divisor = 3, cosiente = 0, resto = 0;
        
        
        while (dividendo >= divisor) {
            cosiente++;            
            resto = dividendo-=divisor;            
        }
        
        System.out.println("Cociente: " + cosiente);
        System.out.println("Resto: " + resto);
        
    }

}
