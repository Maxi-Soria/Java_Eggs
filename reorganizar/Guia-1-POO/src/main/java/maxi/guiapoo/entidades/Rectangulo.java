package maxi.guiapoo.entidades;

/**
 *Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 * @author MAXI
 */
public class Rectangulo {
    private int base, altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }
    public int getAltura() {
        return altura;
    }
    
    public double superficie(){
        return getBase()*getAltura();
    }
    public double perimetro(){
        return (getBase()+ getAltura())*2;
    }
    
    public void dibujar(){
        int base = getBase();
        int altuta = getAltura();
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if(i == 0 || i == altuta-1 || j==0 || j == base-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
