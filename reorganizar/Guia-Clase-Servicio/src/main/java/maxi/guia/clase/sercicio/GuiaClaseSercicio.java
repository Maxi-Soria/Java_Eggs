package maxi.guia.clase.sercicio;


import maxi.guia.clase.sercicio.entidades.Cafetera;
import maxi.guia.clase.sercicio.entidades.CuentaBancaria;
import maxi.guia.clase.sercicio.entidades.Persona;
import maxi.guia.clase.sercicio.servicios.CafeteraServicio;
import maxi.guia.clase.sercicio.servicios.CuentaBancariaServicios;
import maxi.guia.clase.sercicio.servicios.PersonaServivio;

/**
 *
 * @author MAXI
 */
public class GuiaClaseSercicio {

    public static void main(String[] args) {
        PersonaServivio personaServ = new PersonaServivio();
        
        Persona persona1 = new Persona("Juan", 25, 'H', 90, (float) 1.75);
        Persona persona2 = new Persona("María", 17, 'M', 55, (float) 1.60);
        Persona persona3 = new Persona("Carlos", 35, 'H', 80, (float) 1.80);
        Persona persona4 = new Persona("Laura", 28, 'M', 42, (float) 1.68);
        
        int IMC1 = personaServ.calcularIMC(persona1);
        System.out.println(IMC1);
        int IMC2 = personaServ.calcularIMC(persona2);
        System.out.println(IMC2);
        int IMC3 = personaServ.calcularIMC(persona3);
        System.out.println(IMC3);
        int IMC4 = personaServ.calcularIMC(persona4);
        System.out.println(IMC4);
        
        boolean esMayor1 = personaServ.esMayorDeEdad(persona1);
        boolean esMayor2 = personaServ.esMayorDeEdad(persona2);
        boolean esMayor3 = personaServ.esMayorDeEdad(persona3);
        boolean esMayor4 = personaServ.esMayorDeEdad(persona4);
        
        int[] vecIMC = {IMC1,IMC2,IMC3, IMC4};
        boolean[] vecMayoriaEdad = {esMayor1, esMayor2, esMayor3, esMayor4};
        
        mostrarPorcentajesIMC(vecIMC);
        mostrarPorcentajesEdades(vecMayoriaEdad);
        
        

        


        
    }
    static void mostrarPorcentajesIMC(int[] vecIMC){
        int bajo = 0, justo = 0, alto = 0;
        for (int i = 0; i < 4; i++) {
            if(vecIMC[i] == -1){
                bajo++;
            }
            if(vecIMC[i] == 0){
                justo++;
            }
            if(vecIMC[i] == 1){
                alto++;
            }
        }
        
        System.out.println("El porcentaje de personas con IMC bajo es: "+ bajo*100/4);
        System.out.println("El porcentaje de personas con IMC justo es: "+ justo*100/4);
        System.out.println("El porcentaje de personas con IMC alto es: "+ alto*100/4);
    }
    
    static void mostrarPorcentajesEdades(boolean [] vecEdad){
        int mayores = 0, menores = 0;
        for (int i = 0; i < 4; i++) {
            if(vecEdad[i]){
                mayores++;
            }else{
                menores++;
            }
        }
        System.out.println("El porcentaje de mayores es: "+ mayores*100/4);
        System.out.println("El porcentaje de pmenores es: "+ menores*100/4);
    }
    
    static void punto1(){
        CuentaBancariaServicios objCuenta = new CuentaBancariaServicios();
        
        CuentaBancaria clienteNuevo = objCuenta.crearCuenta();
        System.out.println(clienteNuevo.toString()); 
        
        objCuenta.ingresar(1000, clienteNuevo);
        System.out.println(clienteNuevo.toString()); 
        
        objCuenta.retirar(6000, clienteNuevo);
        System.out.println(clienteNuevo.toString()); 
        
        objCuenta.extraccionRapida(clienteNuevo);
        objCuenta.consultarSaldo(clienteNuevo);
        objCuenta.consultarDatos(clienteNuevo);
    }
    
    static void punto2(){
        Cafetera maquina = new Cafetera(1000,0);
        
        System.out.println("Cantidad actual antes de llenar la cafetera: " + maquina.getCapacidadActual());
        
        CafeteraServicio maquinaServicio = new CafeteraServicio();
        maquinaServicio.llenarCafetera(maquina);
        
        System.out.println("Cantidad actual despues de llenar la cafetera: " + maquina.getCapacidadActual());
        
        maquinaServicio.servirTaza(300, maquina);
        maquinaServicio.servirTaza(100, maquina);
        maquinaServicio.agregarCafe(200, maquina);
        System.out.println("Cantidad actual despues de llenar la cafetera: " + maquina.getCapacidadActual());
        maquinaServicio.agregarCafe(500, maquina);
        System.out.println("Cantidad actual despues de llenar la cafetera: " + maquina.getCapacidadActual());
        
    }
}
