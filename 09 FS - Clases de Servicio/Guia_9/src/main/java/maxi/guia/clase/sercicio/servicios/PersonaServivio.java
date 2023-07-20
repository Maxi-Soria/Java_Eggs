package maxi.guia.clase.sercicio.servicios;

import java.util.Scanner;
import maxi.guia.clase.sercicio.entidades.Persona;

/**
 *
 * @author MAXI
 */
public class PersonaServivio {
    
    public boolean esMayorDeEdad(Persona persona){
    return persona.getEdad() >= 18;
    } 
    
    public Persona crearPersona(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("Ingrese la edad: ");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese el sexo: ");
        char sexo = leer.next().charAt(0);
        
        while (sexo != 'H' && sexo != 'M' && sexo != 'O'){
            System.out.println("Sexo incorrecto. Caracteres validos H,M y O:");
            sexo = leer.next().charAt(0);           
            
        }
        
        System.out.println("Ingrese el peso: ");
        float peso = leer.nextFloat();
        
        System.out.println("Ingrese la altura: ");
        float altura = leer.nextFloat();
  
        Persona obj = new Persona(nombre,edad,sexo,peso,altura);
        
        
        return obj;
    }
    
    public int calcularIMC(Persona persona){
        float peso = persona.getPeso();
        float altura = persona.getAltura();
        float IMC = peso/(altura*altura);
        
        if(IMC < 20){
            return -1;
        }else{
            if(IMC >= 20 && IMC <=25){
                return 0;
            }else{
                return 1;
            }
        }
        
    }
}
