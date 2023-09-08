package main;

import entidades.Pais;
import java.util.HashSet;
import java.util.Set;
import servicios.ServiciosPais;

public class Ejercicio_5 {

    public static void main(String[] args) {
        ServiciosPais obj = new ServiciosPais();
        
        Set<Pais> paises = new HashSet();
        
        obj.cargarPais(paises);
        
        //obj.mostrarPaises(paises);
        
        obj.mostrarOrdenados(paises);
        
        obj.quitaPais(paises);
        
        obj.mostrarOrdenados(paises);
        

    }
   
}
