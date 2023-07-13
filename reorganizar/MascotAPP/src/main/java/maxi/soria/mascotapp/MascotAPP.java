package maxi.soria.mascotapp;

import java.util.Scanner;
import maxi.soria.mascotapp.entidades.Mascota;

public class MascotAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        Mascota m1 = new Mascota();
        m1.setNombre("Perrote");
        m1.pasear(250);
        System.out.println(m1.toString());
    }
}
