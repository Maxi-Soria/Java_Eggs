package entidades;

public class Cadena {
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        longitud = frase.length();
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    public String getFrase() {
        return frase;
    }
    public int getLongitud() {
        return longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase = " + frase +'}';
    }

    
    
    
    
}
