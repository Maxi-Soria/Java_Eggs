package maxi.guia_10_ejercicio_4;

import entidades.Persona;
import java.time.LocalDate;
import servicios.FechaService;
import servicios.PersonaService;

public class Guia_10_Ejercicio_4 {

    public static void main(String[] args) {
        FechaService obj = new FechaService();
        PersonaService objPersona = new PersonaService();
        Persona individuo = new Persona();
        
        //LocalDate fechaNacimiento = obj.fechaNacimiento();
        //System.out.println("Fecha: "+ fechaNacimiento);
        //LocalDate fechaAct = obj.fechaActual();
        //System.out.println("Actual: "+ fechaAct);
        
        //int edad = obj.diferencia(fechaNacimiento, fechaAct);
        //System.out.println("Edad: "+edad);
        
        individuo = objPersona.crearPersona();
        System.out.println("Nombre: "+individuo.getNombre());
        System.out.println("Fecha Nac: "+individuo.getFechaNacimiento());
        
        int Edad = objPersona.calcularEdad(individuo.getFechaNacimiento());
        System.out.println("Edad: "+Edad);
        
    }
}
