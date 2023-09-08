package main;

import entidades.Perro;
import entidades.Persona;


public class Ejercicio_1 {

    public static void main(String[] args) {
        Perro mascota = new Perro("Spike", "Callejero ", 5, 20);
        Persona individuo = new Persona("Juan ","Perez",30,11223344, mascota);
        
        System.out.println(individuo.toString());
    }
}
