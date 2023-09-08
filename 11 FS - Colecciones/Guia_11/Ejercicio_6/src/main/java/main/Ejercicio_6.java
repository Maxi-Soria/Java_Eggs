package main;

import java.util.HashMap;
import java.util.Scanner;
import servicios.ServiciosProducto;


public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ServiciosProducto obj = new ServiciosProducto();
        HashMap<String, Integer> listaProductos = new HashMap();
        
        int opcion;
        
        do {
            System.out.println("1- CARGAR PRODUCTOS");
            System.out.println("2- MOSTRAR PRODUCTOS");
            System.out.println("3- MODIFICAR PRECIO");
            System.out.println("4- QUITAR UN PRODUCTO");
            System.out.println("0- SALIR");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    listaProductos.put("Camisa", 2000);
                    listaProductos.put("Remera", 3000);
                    listaProductos.put("Pantalo", 6000);
                    obj.cargarProducto(listaProductos);

                    break;

                case 2:
                    obj.mostrarProductos(listaProductos);

                    break;

                case 3:
                    obj.modificarPrecio(listaProductos); 

                    break;
                case 4:
                    obj.eliminarProducto(listaProductos);

                    break;
                case 0:
                    String opc;
                    System.out.println("Seguro desea sali s/n");
                    opc = leer.next();
                    if(opc.equalsIgnoreCase("n")){opcion = -1;}
                    break;

                default:
                    System.out.println("Opcion no validad, elija una opcion de 0 a 4");
            }
            System.out.println();
        } while (opcion != 0);
                
    }
    
}
