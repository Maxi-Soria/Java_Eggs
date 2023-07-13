package maxi.ej1clasecadena;

import entidades.Cadena;
import java.util.Scanner;
import servicios.ServiciosCadena;

public class Ej1ClaseCadena {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cadena cad = new Cadena("La mar estaba serena ");
        ServiciosCadena ser = new ServiciosCadena();
        System.out.println("Frase Original: "+ cad.getFrase());
              
        //ser.invertirfrase(cad);
        
        System.out.println("Frase invertida: " + cad.getFrase());
        
        String letra = "i";
        ser.vecesRepetido(cad, letra);
        
        System.out.println("Ingrese una frase para comparar ");
        String fraseNueva = leer.nextLine();
        
        ser.compararLongitud(cad, fraseNueva);
        
        ser.unirFrases(cad, fraseNueva);
        
        ser.remplazar(cad, letra);
        
        boolean esta = ser.contiene(cad, letra);
        System.out.println("Contiene la letra " + esta);

        
    }
}
