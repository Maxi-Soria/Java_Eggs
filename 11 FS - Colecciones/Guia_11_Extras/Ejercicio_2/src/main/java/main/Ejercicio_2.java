package main;

import entidades.CantanteFamoso;
import java.util.ArrayList;
import servicios.ServicioCantante;

/**
 *Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 */
public class Ejercicio_2 {

    public static void main(String[] args) {
        ServicioCantante servCantante = new ServicioCantante();
        ArrayList<CantanteFamoso> listaCantantes = new ArrayList();
        
        listaCantantes.add(new CantanteFamoso("Michael Jackson", "Thriller"));
        listaCantantes.add(new CantanteFamoso("Madonna", "The Immaculate Collection"));
        listaCantantes.add(new CantanteFamoso("Elvis Presley", "Elvis' Christmas Album"));
        listaCantantes.add(new CantanteFamoso("The Beatles", "Sgt. Pepper's Lonely Hearts Club Band"));
        listaCantantes.add(new CantanteFamoso("Celine Dion", "Falling into You"));

        
        servCantante.mostrarLista(listaCantantes);
        servCantante.cargarCantantes(listaCantantes);
        servCantante.mostrarLista(listaCantantes);
        
        
       
    }
}
