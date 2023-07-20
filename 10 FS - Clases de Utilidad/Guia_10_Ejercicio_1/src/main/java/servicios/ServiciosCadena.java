package servicios;
import entidades.Cadena;


public class ServiciosCadena {
    
    
    public int contarVocales(Cadena cad){
        String frase = cad.getFrase();
        int cont = 0;
        
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if(esVocal(letra)){
               cont++;
            }
        }
    return cont;
    }
    
    public void invertirfrase(Cadena cad){
        String frase = cad.getFrase();
        char[] fraseInvertida = new char[frase.length()];
        int ultimaPos = frase.length()-1;
        
        for (int i = 0; i < frase.length(); i++) {
            fraseInvertida[i] = frase.charAt(ultimaPos);
            ultimaPos--;
        }
        cad.setFrase( new String(fraseInvertida));       
    }
    
    public void vecesRepetido(Cadena cad, String letra){
        String frase = cad.getFrase();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(frase.charAt(i)).equalsIgnoreCase(letra)){
                cont++;
            }
        }
        System.out.println("El caracter "+ letra + " se repite "+ cont + " veces.");
    }
    
    public void compararLongitud(Cadena cad, String fraseNueva){
        String frase1 = cad.getFrase();
        
        if(frase1.length() > fraseNueva.length()){
            System.out.println("La frase '" + frase1 + "' tiene mas caracteres que '" + fraseNueva + "'.");
        }else{
            if(frase1.length() < fraseNueva.length()){
                System.out.println("La frase '" + fraseNueva + "' tiene mas caracteres que '" + frase1 + "'.");
            }else{
                System.out.println("Ambas frases tienen la misma cantidad de caracteres.");
            }
        }

    }
    
    public void unirFrases(Cadena cad, String fraseNueva){
        String frase = cad.getFrase();
        
        System.out.println(frase.concat(fraseNueva));
    }
    
    public void remplazar(Cadena cad, String letra){
        String frase = cad.getFrase();
        String nueva = frase.replaceAll("[aA]",letra);
        System.out.println("La frase queda: " + nueva);
        
    }
    
    public boolean contiene(Cadena cad, String letra){
        String frase = cad.getFrase();
        
        for (int i = 0; i < frase.length(); i++) {
            if(String.valueOf(frase.charAt(i)).equalsIgnoreCase(letra)){
                return true;
            }
        }
       return false;
    }
        
    private boolean esVocal(char letra){
        char cMin = Character.toLowerCase(letra);
    return (cMin == 'a' || cMin == 'e' || cMin == 'i' || cMin == 'o' || cMin == 'u');
    }
}
