package maxi.guiapooextra.entidades;

import java.util.Scanner;

/**
 *Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 * @author MAXI
 */
public class Juego {
    public void iniciarJuego(){
        Scanner leer = new Scanner(System.in);
        int cont = 1;
        
        int numJugador1, numJugador2 = 0;
        System.out.println("Jugador 1, Elija el numero entre 1 y 50: ");
        numJugador1 = leer.nextInt();
        
        System.out.println("Jugador 2, Elija el numero entre 1 y 50: ");
        numJugador2 = leer.nextInt();
        
        while (numJugador1 != numJugador2 && cont < 5) {
            if(numJugador2 > numJugador1){
                System.out.println("Te pasaste!!!");
            }else{
                System.out.println("Te falsta!!!");
            }
            
            
            System.out.println("Jugador 2, Elija el numero entre 1 y 50: ");
            numJugador2 = leer.nextInt();
            cont++;
        }
        if(numJugador1 == numJugador2){
            System.out.println("Felicidades, adivinaste!!!");
        }else{
            System.out.println("Perdiste, suerte para la proxima");
        } 
        
    }
}
