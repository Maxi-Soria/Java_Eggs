package servicios;

import entidades.Persona;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        System.out.println("Nombre: ");
        String nombre = leer.nextLine();
        
        System.out.println("Fecha de nacimiento");
        System.out.print("Dia: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int anio = leer.nextInt();
        LocalDate fechaNac = LocalDate.of(anio, mes, dia);
        
        return new Persona(nombre,fechaNac);       
    }
    
    public int calcularEdad(LocalDate fechaNac){
        LocalDate fechaAct = LocalDate.now();
        Period dife = Period.between(fechaNac, fechaAct);
        return dife.getYears();
    }
    
    public boolean menorQue(Persona persona, int edadConsultada) {
        LocalDate fechaNacimiento = persona.getFechaNacimiento();
        int edad = calcularEdad(fechaNacimiento);
        return edad < edadConsultada;
    }
    
    public void mostrarPersona(Persona persona) {
        System.out.println("Informacion de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de Nacimiento: " + persona.getFechaNacimiento());
        int edad = calcularEdad(persona.getFechaNacimiento());
        System.out.println("Edad: " + edad + " años");
    }
}
