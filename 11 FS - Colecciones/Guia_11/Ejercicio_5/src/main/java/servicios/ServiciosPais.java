
package servicios;

import entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ServiciosPais {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public void cargarPais(Set<Pais> paises){
        boolean continuar = true;
  
        do {
            System.out.print("Ingrese el pais o 'salir' para finalizar: ");
            String nomPais = leer.next();
            if(nomPais.equalsIgnoreCase("salir")){
                continuar = false;
            }else{
                paises.add(new Pais(nomPais));
                
            }    
        } while (continuar);
    }
    
    public void mostrarPaises(Set<Pais> paises){
        for (Pais pais : paises) {
            System.out.println(pais.getNombrePais());
            
        }
    }
    
    public void mostrarOrdenados(Set<Pais> paises) {
        TreeSet<Pais> paisesOrdenados = new TreeSet<Pais>(Pais.ordenarAlfabeticamente);
        paisesOrdenados.addAll(paises);
        System.out.println("Paises guardados (ordenados alfabéticamente):");

        for (Pais pais : paisesOrdenados) {
            System.out.println(pais.getNombrePais());
        }
    }
    
    public void quitaPais(Set<Pais> listaPaises){
        System.out.print("Ingrese el pais a borrar: ");
        String borrar = leer.next();
        
        Iterator<Pais> iterador = listaPaises.iterator();
        
        boolean encontrado = false;
        
        while(iterador.hasNext()){
            Pais aux = iterador.next();
            if(aux.getNombrePais().equalsIgnoreCase(borrar)){
                iterador.remove();
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println("El pais fue quitado de la lista");
        }else{
            System.out.println("El pais no se encuentra en la lista");
        }
    }
}
