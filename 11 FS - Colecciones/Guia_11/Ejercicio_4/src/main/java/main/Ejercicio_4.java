package main;

import entidades.Pelicula;
import java.util.ArrayList;
import servicios.PeliculaService;

public class Ejercicio_4 {

    public static void main(String[] args) {
        PeliculaService obj = new PeliculaService();
        
        ArrayList<Pelicula> listaPelis = new ArrayList();
        
        obj.agregarPeliculas(listaPelis);
        
        obj.mostrarPeliculas(listaPelis);
        
        obj.mostrarMasDeUnaHora(listaPelis);
        
        obj.mostrarPorDuracionMayorMenor(listaPelis);
        
        obj.mostrarPorDuracionMenorMayor(listaPelis);
        
        obj.mostrarOrdenadasPorTitulo(listaPelis);
        
        obj.mostrarOrdenadasPorDirector(listaPelis);
        
        
        
    }
}
