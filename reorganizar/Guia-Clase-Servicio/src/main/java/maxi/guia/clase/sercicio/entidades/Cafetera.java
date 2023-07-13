package maxi.guia.clase.sercicio.entidades;

/**
 *
 * @author MAXI
 */
public class Cafetera {
    private float capacidadMaxima;
    private float capacidadActual;

    public Cafetera() {
    }
    public Cafetera(float capacidadMaxima, float capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public float getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public void setCapacidadMaxima(float capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public float getCapacidadActual() {
        return capacidadActual;
    }
    public void setCapacidadActual(float capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    
}
