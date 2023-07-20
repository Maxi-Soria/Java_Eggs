package servicios;

import entidades.ParDeNumeros;

public class ParDeNumerosServivce {
        public void mostrarValores(ParDeNumeros par){
        
            System.out.println("Primer numero: " + par.getNumero1());
            System.out.println("Segundo numero: " + par.getNumero2());
        }
    
        public double devolverMayor(ParDeNumeros par){
           return (par.getNumero1() > par.getNumero2()) ? par.getNumero1() : par.getNumero2();
                
        }
    
        public int calcularPotencia(ParDeNumeros par){
            int num1 = (int)Math.round(par.getNumero1());
            int num2 = (int)Math.round(par.getNumero2());
            
            if(num1 >= num2){
                return (int) Math.pow(num1, num2);
            }else{
                return (int) Math.pow(num1, num2);
            }           
        }
        
        public void calcularRaiz(ParDeNumeros par){
            int num1 = (int)Math.round(par.getNumero1());
            int num2 = (int)Math.round(par.getNumero2());
            int menor, mayor;
            if(num1 < num2){
                menor = num1;
            }else{
                menor = num2;
            }  
            
            System.out.println("La raiz cuadrada del menor es: "+ Math.sqrt(menor));
            
            
        }
        
}
