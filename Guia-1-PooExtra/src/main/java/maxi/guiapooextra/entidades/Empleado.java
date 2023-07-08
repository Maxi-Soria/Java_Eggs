package maxi.guiapooextra.entidades;

/**
 *Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 * @author MAXI
 */
public class Empleado {
    private String nombre;
    private int edad;
    private float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public float getSalario() {
        return salario;
    }
    
    public float calcularAumento(){
        float salarioNew; 
        if(getEdad() > 30){
            setSalario((float) (getSalario()*1.10));
        }else{
            setSalario((float) (getSalario()*1.05));
        }
        salarioNew = getSalario();
        return salarioNew;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
    
    
    
    
    
}
