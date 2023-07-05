/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author MAXI
 */
public class Persona {
    
    private String _nombre;
    private int _edad;
    private double _altura;
    
    
    public Persona (){
        _nombre = "Facundo";
       
    }
    
    public Persona(String nombre){
        _nombre = nombre;
        _edad = 35;
        _altura = 1.7;
    }
    
    public void Mostrar(){
        System.out.print("Nombre: " + _nombre+ "\n");
        System.out.print("Edad: " + _edad + "\n");
        System.out.println("Altura: "+ _altura);
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getEdad() {
        return _edad;
    }

    public void setEdad(int _edad) {
        this._edad = _edad;
    }

    public double getAltura() {
        return _altura;
    }

    public void setAltura(double _altura) {
        this._altura = _altura;
    }
    
    
}
