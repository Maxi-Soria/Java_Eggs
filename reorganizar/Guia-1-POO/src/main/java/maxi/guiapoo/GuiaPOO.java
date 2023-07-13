package maxi.guiapoo;

import maxi.guiapoo.entidades.Circunferencia;
import maxi.guiapoo.entidades.Libro;
import maxi.guiapoo.entidades.Operacion;
import maxi.guiapoo.entidades.Rectangulo;

public class GuiaPOO {

    public static void main(String[] args) {
        
 
    }
    
    
    static void Punto1(){
        Libro obj = new Libro();
        obj.Cargar();
        System.out.println(obj);
    }
    
    static void Punto2(){
       Circunferencia circun = new Circunferencia(10);
       circun.crearCircunferencia();
       System.out.println("Area: " + circun.calcularArea());
       System.out.println("Perimetro: " + circun.calcularPerimetro());
    }
    
    static void Punto3(){
        Operacion n1 = new Operacion();
        n1.crearOperacion();
        System.out.println("Resultado: " + n1.sumar());
        System.out.println("Resultado: " + n1.restar());
        System.out.println("Resultado: " + n1.multiplicar());
        System.out.println("Resultado: " + n1.dividir());
    }
    
    static void Punto4(){
        Rectangulo obj = new Rectangulo(10, 4);
        obj.dibujar();   
    }
}
