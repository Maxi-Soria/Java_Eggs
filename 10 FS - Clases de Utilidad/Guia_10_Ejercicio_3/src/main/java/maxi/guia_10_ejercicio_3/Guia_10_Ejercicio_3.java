package maxi.guia_10_ejercicio_3;


import servicios.ArregloService;

public class Guia_10_Ejercicio_3 {

    public static void main(String[] args) {
        ArregloService obj = new ArregloService();
        
        int A[] = new int[30];
        int B[] = new int[20];
        
        obj.inicializarA(A);
        obj.mostrar(A);
        System.out.println();
        //obj.ordenar(A);
        //obj.mostrar(A);
        //obj.inicializarB(A, B);
        //obj.mostrar(B);
        
    }
}
