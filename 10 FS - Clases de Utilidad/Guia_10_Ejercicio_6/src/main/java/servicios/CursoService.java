
package servicios;

import entidades.Curso;
import java.util.Scanner;

public class CursoService {
    public static void cargarAlumnos(String[] alumnos){
        Scanner leer = new Scanner(System.in);
        
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print("Ingrese el nombre del alumno "+(i+1)+": ");
            alumnos[i] = leer.nextLine();
        }
    }
    
    public void crearCurso(Curso cursoNuevo){
         Scanner leer = new Scanner(System.in);
         
         System.out.print("Ingrese el nombre del curso: ");
         cursoNuevo.setNombreCurso(leer.nextLine());
         
         System.out.print("Ingrese la cantidad de horas por dia: ");
         cursoNuevo.setCantHorasPorDia(leer.nextInt());
         
         System.out.print("Ingrese la cantidad de dias por semana: ");
         cursoNuevo.setCantDiasPorSemana(leer.nextInt());
         
         leer.nextLine();
         System.out.print("Ingrese el turno: ");
         cursoNuevo.setTurno(leer.nextLine());
         
         System.out.print("Ingrese el precio por hora: ");
         cursoNuevo.setPrecioPorHora(leer.nextDouble());
         
         cargarAlumnos(cursoNuevo.getAlumnos());
    }
    
    public double calcularGananciaSemanal(Curso curso) {
        int cantidadHorasPorSemana = curso.getCantHorasPorDia() * curso.getCantDiasPorSemana();
        double gananciaSemanal = cantidadHorasPorSemana * curso.getPrecioPorHora() * 5;
        
        return gananciaSemanal;
    }
}


