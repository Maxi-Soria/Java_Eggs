package servicios;

public class ArregloService {
    public void inicializarA(int vec[]){
        for (int i = 0; i < vec.length; i++) {
            vec[i]= (int) (1+ Math.random()*50);
        }
    }
    
    public void mostrar(int vec[]){
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i]+" ");            
        }   
    }
    
    public void ordenar(int vec[]){
        int aux;
        for (int i = 0; i < vec.length-1; i++) {
            for (int j = 0; j < vec.length-1; j++) {
                if(vec[j]>vec[j+1]){
                    aux = vec[j];
                    vec[j]=vec[j+1];
                    vec[j+1]= aux;
                }
            }
        }
        
    }
    
    public void inicializarB(int vecA[], int vecB[]){
        
        for (int i = 0; i < vecB.length; i++) {
            if(i<10){
                vecB[i]= vecA[i];
            }else{
                vecB[i]=2;
            }
        }
        
    }
}
