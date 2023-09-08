
package servicios;

import entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Pelicula cargarPelicula(){
        System.out.print("Ingrese el titulo: ");
        String titulo = leer.next();
        System.out.print("Ingrese el director: ");
        String director = leer.next();
        System.out.print("Ingrese la duracion en horas: ");
        double duracion = leer.nextDouble();
        
        return  new Pelicula(titulo,director,duracion);
        
    }  
    
    public void agregarPeliculas(ArrayList<Pelicula> listaPeliculas){
        boolean continuar = true;
        do {
            listaPeliculas.add(cargarPelicula());
            System.out.print("Desea cargar otra pelicula S/N ? ");
            String eleccion = leer.next();
            continuar = !eleccion.equalsIgnoreCase("N");
            System.out.println();
            
        } while (continuar);   
    }
    
    public void mostrarPeliculas(ArrayList<Pelicula> lista){
        System.out.println("La lista de peliculas es: ");
        for (Pelicula peli : lista) {
            System.out.println(peli);
        }
    }
    
    public void mostrarMasDeUnaHora(ArrayList<Pelicula> lista){
        System.out.println("\nLas peliculas que duran mas de 1 hora son: ");
        for (Pelicula peli : lista) {
            if(peli.getDuracion() > 1){
                System.out.println(peli);
            }
        }
        
    }
    
    public void mostrarPorDuracionMayorMenor(ArrayList<Pelicula> lista) {
       
        Collections.sort(lista, Comparator.comparingDouble(Pelicula::getDuracion).reversed());

        System.out.println("\nLista de peliculas ordenadas por Duracion (de mayor a menor):");
        for (Pelicula peli : lista) {
            System.out.println(peli);
        }
        
    }
    public void mostrarPorDuracionMenorMayor(ArrayList<Pelicula> lista) {
       
        Collections.sort(lista, Comparator.comparingDouble(Pelicula::getDuracion));

        System.out.println("\nLista de peliculas ordenadas por Duracion (menor a mayor):");
        for (Pelicula peli : lista) {
            System.out.println(peli);
        }
        
    }
    
    public void mostrarOrdenadasPorTitulo(ArrayList<Pelicula> lista) {
      
        Collections.sort(lista, Comparator.comparing(Pelicula::getTitulo));

        System.out.println("\nLista de peliculas ordenadas por Titulo:");
        for (Pelicula peli : lista) {
            System.out.println(peli);
        }
    }
    public void mostrarOrdenadasPorDirector(ArrayList<Pelicula> lista) {
      
        Collections.sort(lista, Comparator.comparing(Pelicula::getDirector));

        System.out.println("\nLista de peliculas ordenadas por Director:");
        for (Pelicula peli : lista) {
            System.out.println(peli);
        }
    }

}
