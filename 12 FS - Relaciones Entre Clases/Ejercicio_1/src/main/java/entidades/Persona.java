package entidades;

public class Persona {
    private String nombre;
    private String apellido;
    private int  edad;
    private int dni;
    private Perro nombrePerro;

    public Persona(String nombre, String apellido, int edad, int dni, Perro nombrePerro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.nombrePerro = nombrePerro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Perro getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(Perro nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + " " + edad + " " + dni + " \n" + nombrePerro;
    }
    
    
    
    
    
}


