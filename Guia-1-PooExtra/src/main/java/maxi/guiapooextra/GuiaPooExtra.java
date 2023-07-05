package maxi.guiapooextra;

import maxi.guiapooextra.entidades.Cancion;
import maxi.guiapooextra.entidades.Cuenta;
import maxi.guiapooextra.entidades.Juego;
import maxi.guiapooextra.entidades.Puntos;

public class GuiaPooExtra {

    public static void main(String[] args) {
        
        
        
    }
    
    static void punto1(){
        Cancion obj = new Cancion(" La cumparcita", " Alguien");
        System.out.println(obj);  
    }
    static void punto2(){
       Puntos obj = new Puntos();
       obj.crearPuntos();
       System.out.println("La distancia es: " + obj.calcularDistancia());
    }
    static void punto3(){
        Juego obj = new Juego();
        obj.iniciarJuego();
    }
    static void punto4(){
        Cuenta obj = new Cuenta(50000, "Maximiliano Soria");
        System.out.println("El saldo en la cuenta es: " + obj.retirarDinero(10000));   
    }
    
}
