package servicios;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FechaService {
    Scanner leer = new Scanner(System.in);
    
    public LocalDate fechaNacimiento() {
        System.out.println("Ingrese su día de nacimiento: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese su año de nacimiento: ");
        int anio = leer.nextInt();
        
        LocalDate fechaNac = LocalDate.of(anio, mes, dia);
        
        return fechaNac;
    }
    
    public LocalDate fechaActual(){
        LocalDate fechaAct = LocalDate.now();
        return fechaAct;
    }
    
    public int diferencia(LocalDate fecha1, LocalDate fechaActual){
        Period dife = Period.between(fecha1, fechaActual);
        return dife.getYears();
        
    }
}
