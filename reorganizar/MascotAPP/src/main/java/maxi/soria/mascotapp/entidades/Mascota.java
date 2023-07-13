package maxi.soria.mascotapp.entidades;

public class Mascota {
    
    private String apodo;
    private String nombre;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;

    //CONSTRUCTORES
    public Mascota() {
       energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        energia = 1000;
    }

    //SETTERS
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    
    ///GETTERS
    public String getApodo() {
        return apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    public int pasear(int energiaRestar){
        energia -= energiaRestar;
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "apodo=" + apodo + ", nombre=" + nombre + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
  
    
    
    
    
    
     
    
}
