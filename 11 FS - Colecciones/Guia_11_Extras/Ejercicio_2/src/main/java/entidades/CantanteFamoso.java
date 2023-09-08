
package entidades;

public class CantanteFamoso {
    private String nombre;
    private String discoConMasVentas;

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }
    
    
    @Override
    public String toString() {
        return nombre + "   " + discoConMasVentas;
    }
    
}
