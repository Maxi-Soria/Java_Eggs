package main;

import entidades.Alumno;
import java.util.ArrayList;
import servicios.AlumnoServicio;

public class Ejercicio_3 {

    public static void main(String[] args) {
        AlumnoServicio obj = new AlumnoServicio();
        ArrayList<Alumno> nuevaLista = new ArrayList();
        nuevaLista = obj.crearListaDeAlumnos();
        
        double promedio = obj.notaFinal(nuevaLista);
        
        System.out.println("La nota final es: "+ promedio);
        
        //System.out.println(nuevaLista);
    }
}
