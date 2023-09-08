package servicios;

import entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public ArrayList<Alumno> crearListaDeAlumnos(){
        ArrayList<Alumno> listaAlumnos = new ArrayList();
        
        boolean continuar = true;
        do { 

            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = leer.next();
        
            
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Ingrese las notas: ");
            for (int i = 0; i < 3; i++) {
                System.out.print("Nota "+ (i+1) + ": ");
                Integer nota = leer.nextInt();
                notas.add(nota);
            }
            
            
            Alumno alumno = new Alumno(nombre,notas);
            listaAlumnos.add(alumno);
            
            System.out.print("Desea agregar otro alumno? ");
            String respuesta = leer.next().toLowerCase();
            
            if(respuesta.equals("n")){ continuar = false;}
            
            System.out.println();
            
           
            
        } while (continuar);
        
        return listaAlumnos;
    }
    
    public double notaFinal(ArrayList<Alumno> listaAlumnos){
        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String nombreAlumno = leer.next();
        
        Iterator<Alumno> iterador = listaAlumnos.iterator();
        while (iterador.hasNext()) {
            Alumno aux = iterador.next();
            if(aux.getNombre().equalsIgnoreCase(nombreAlumno)){
                return promedioNotas(aux);
                
            } 
        } 
        System.out.println("El Alumno "+ nombreAlumno + " no esta en la lista. ");
     return 0;
    }
    
    public double promedioNotas(Alumno alumno){
        double acumNotas = 0;
        for (Integer nota: alumno.getNotas()){
            acumNotas += nota;
        }
        return acumNotas/alumno.getNotas().size();
    }
}
