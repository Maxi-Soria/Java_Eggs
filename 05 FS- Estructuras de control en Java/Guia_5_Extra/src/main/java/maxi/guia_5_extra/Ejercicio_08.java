package maxi.guia_5_extra;

import java.util.Scanner;

public class Ejercicio_08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int pares = 0, impares = 0;
        
        System.out.print("Ingrese el numero: ");
        int numero = leer.nextInt();
        
        while ((numero % 5) !=  0) {
            
            if (numero < 0 ){
                break;
            }else{
                if(numero % 2 == 0){
                    pares++;
                }else{
                    impares++;
                }
                
            }
            System.out.print("Ingrese el numero: ");
            numero = leer.nextInt();              
        }
        System.out.println("Pares: " + pares );
        System.out.println("Impares: " + impares );
    }

}
