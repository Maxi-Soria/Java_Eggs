package maxi.guia.clase.sercicio.servicios;

import java.util.Scanner;
import maxi.guia.clase.sercicio.entidades.Cafetera;


public class CafeteraServicio {
    private Scanner leer = new Scanner(System.in);
    public void llenarCafetera(Cafetera maquina){
        maquina.setCapacidadActual(maquina.getCapacidadMaxima());
    }
    
    public void servirTaza(int capacidadTaza, Cafetera maquina){
        if (maquina.getCapacidadActual() >= capacidadTaza){
            maquina.setCapacidadActual(maquina.getCapacidadActual()-capacidadTaza);
            System.out.println("Se lleno la taza");
        }else{
            float capacidad = maquina.getCapacidadActual();
            maquina.setCapacidadActual(0);
            System.out.println("No hay suficiente cafe, solo se cargo " + capacidad);
        }
    }
    
    public void vaciarCafetera(Cafetera maquina){
        maquina.setCapacidadActual(0);
    }
    
    public void agregarCafe(int cantidadAgregar, Cafetera maquina){
        if(cantidadAgregar <= maquina.getCapacidadMaxima() - maquina.getCapacidadActual()){
            maquina.setCapacidadActual(maquina.getCapacidadActual()+cantidadAgregar);
            System.out.println("Se agrego " + cantidadAgregar + " de cafe a la cafetera");
        }else{
            float cantUsada = maquina.getCapacidadMaxima() - maquina.getCapacidadActual();
            float resto = cantidadAgregar - cantUsada;
            maquina.setCapacidadActual(maquina.getCapacidadMaxima());
            System.out.println("Se lleno la cafetera y sobraron " + resto + " de cafe");
        }
    }
}
