package maxi.guia.clase.sercicio.servicios;

import java.util.Scanner;
import maxi.guia.clase.sercicio.entidades.CuentaBancaria;

public class CuentaBancariaServicios {
    
    private Scanner leer = new Scanner(System.in);
        
    public CuentaBancaria crearCuenta(){
        System.out.print("Ingrese el numero de cuenta: ");
        int numCuenta = leer.nextInt();
        System.out.print("Ingrese el numero de dni: ");
        long numDni = leer.nextInt();
        System.out.print("Ingrese el saldo: ");
        double saldo = leer.nextDouble();
            
        CuentaBancaria newCliente = new CuentaBancaria(numCuenta,numDni, saldo );
            
        return newCliente;
    }
        
    public void ingresar(double cantidad, CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        saldoActual += cantidad;
        cuenta.setSaldoActual(saldoActual);
        
        System.out.println("Se han ingresado " + cantidad + "  a la cuenta");
        System.out.println("Nuevo saldo actual: " + cuenta.getSaldoActual());
    }
    
    public void retirar(double cantidad, CuentaBancaria cuenta) {
        double saldoActual = cuenta.getSaldoActual();
        if(saldoActual >= cantidad){
            saldoActual -= cantidad;
            cuenta.setSaldoActual(saldoActual);

        }else{
            cantidad = saldoActual;
            cuenta.setSaldoActual(0);
        }
        System.out.println("Se ha retirado " + cantidad + "  a la cuenta");
        System.out.println("Nuevo saldo actual: " + cuenta.getSaldoActual());
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        double saldo = cuenta.getSaldoActual();
        cuenta.setSaldoActual(saldo*0.8);
        System.out.println("Usted retiro: "+ saldo*0.2 + " saldo restante: "+ cuenta.getSaldoActual());
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Saldo disponible: " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println(cuenta.toString());
    }
    
    
}
