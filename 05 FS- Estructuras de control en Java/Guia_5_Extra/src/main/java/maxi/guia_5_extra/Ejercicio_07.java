package maxi.guia_5_extra;

import java.util.Scanner;

public class Ejercicio_07 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int contador = 0, suma = 0, numero, maximo = 0, minimo = 0;

        System.out.print("Ingrese la cantidad de numeros: ");
        int cantidadNumeros = leer.nextInt();


        while (contador < cantidadNumeros) {
            System.out.print("Ingrese el numero " + (contador+1 ) + ": ");
            numero = leer.nextInt();
            if(contador == 0){
                maximo = numero;
                minimo = numero;
            }
            
            suma += numero;
            contador++;
            
            if(numero > maximo){
                maximo = numero;
            }else{
                if(numero < minimo){
                   minimo = numero;
                }
            }
                        
        }

        double promedio = (double) suma / cantidadNumeros;

        System.out.println("Valor maximo: " + maximo);
        System.out.println("Valor minimo: " + minimo);
        System.out.println("Promedio: " + promedio);
    }

}
