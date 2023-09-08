
package servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServiciosProducto {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    
    public void cargarProducto(HashMap<String, Integer > listaProductos){
        System.out.println("CARGANDO PRODUCTOS");
        
        boolean continuar = true;
        do {            
            System.out.print("Ingresar nombre: ");
            String nomb = leer.next();
            System.out.print("Ingrese el valor: ");
            Integer valor = leer.nextInt();
            
            listaProductos.put(nomb, valor);
            
            System.out.print("CONTINUAR S/N ? ");
            String opc = leer.next();
            if(opc.equalsIgnoreCase("N")){continuar = false;}
            
        } while (continuar);
    }
    
    public void mostrarProductos(HashMap<String, Integer> listaProductos){
        
        for (Map.Entry<String, Integer> entry : listaProductos.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("KEY: "+ key + " IMPORTE: " + value );
        }
        
    }
    
    public void modificarPrecio(HashMap<String, Integer > listaProductos){
        System.out.print("Ingrese el producto que desea modificar: ");
        String buscar = leer.next();
        System.out.print("Ingrese el valor nuevo: ");
        Integer nuevoValor = leer.nextInt();
        
        Integer remplazo = listaProductos.replace(buscar, nuevoValor);
        
        if(remplazo != null){System.out.println("Precio Actualizado");}
        else{System.out.println("Producto no encontrado");}  
    }
    
    public void eliminarProducto(HashMap<String, Integer > listaProductos){
        System.out.print("Ingrese el producto que desea quitar: ");
        String buscar = leer.next();
       
        listaProductos.remove(buscar);
        
 
    }
    
}
