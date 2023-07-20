package maxi.guia_10_ejercicio_6;

import entidades.Curso;
import servicios.CursoService;

public class Guia_10_Ejercicio_6 {

    public static void main(String[] args) {
        CursoService cursoService = new CursoService();
        Curso ingles = new Curso();
        cursoService.crearCurso(ingles);
        double ganancia = cursoService.calcularGananciaSemanal(ingles);
        System.out.println("Ganancia: "+ganancia);
    }
}
