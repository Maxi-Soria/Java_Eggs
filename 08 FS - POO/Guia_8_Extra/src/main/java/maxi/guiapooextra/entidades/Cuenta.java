package maxi.guiapooextra.entidades;

/**
 *Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 * @author MAXI
 */
public class Cuenta {
    private double saldo;
    private String titular;

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    
    
    public double retirarDinero(double saldo){
        if(saldo <= this.saldo){
            this.saldo -= saldo;
        }else{
            System.out.println("Dinero insuficiente solo pudo extrer " + getSaldo());
            this.saldo = 0;
        }
        return getSaldo();
    }
    
}
