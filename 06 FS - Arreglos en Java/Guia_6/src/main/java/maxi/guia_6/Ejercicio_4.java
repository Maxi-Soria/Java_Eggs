package maxi.guia_6;

public class Ejercicio_4 {

    public static void main(String[] args) {
        int mat[][] = new int [4][4];
        
        ///Cargar matriz
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j] = (int) (Math.random()*10);               
            }            
        }
        
        ///Mostrar matriz
        System.out.println("\nNormal");        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "  ");               
            } 
            System.out.println();
        }
        
        System.out.println("\nTraspuesta");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[j][i]+"  ");               
            } 
            System.out.println();
        }
        
        
        
        
    }

}
