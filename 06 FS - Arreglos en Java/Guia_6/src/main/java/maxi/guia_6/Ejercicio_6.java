package maxi.guia_6;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {
        //int mat[][] = {{2,7,6},{9,5,1},{4,3,8}};
        int mat[][] = new int [3][3];
        cargarMatriz(mat);
        
        int num = mat[0][0]+mat[0][1]+mat[0][2];
        
        boolean filas =  filaCumple(mat,num);
        boolean columna =  columnaCumple(mat,num);
        boolean d1 = diagonal1Cumple(mat, num);
        boolean d2 = diagonal2Cumple(mat, num);
        
        boolean esMagico = false;
        if(filas && columna && d1 && d2){
            esMagico = true;
        }
        System.out.println("Es una matriz magica: " + esMagico);
        
        
    }
    static void cargarMatriz(int mat[][]){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print("Ingrese el numero para la pos ["+i+"]"+"["+j+"]: ");
                mat[i][j] = leer.nextInt();
            }
            
        }
        
        
    }
    
    static boolean filaCumple(int mat[][], int num){
        for (int i = 0; i < mat.length; i++) {
            int suma = 0;
            for (int j = 0; j < mat.length; j++) {
                suma+=mat[i][j];                
            }
            if(suma != num){
                return false;
            }
        }    
    return true;
    }
    
    static boolean columnaCumple(int mat[][], int num){
        for (int i = 0; i < mat.length; i++) {
            int suma = 0;
            for (int j = 0; j < mat.length; j++) {
                suma+=mat[j][i];                
            }
            if(suma != num){
                return false;
            }
        }    
    return true;
    }
    
    static boolean diagonal1Cumple(int mat[][], int num){
        return mat[0][0]+mat[1][1]+mat[2][2] == num;
    }
    
    static boolean diagonal2Cumple(int mat[][], int num){
        return mat[0][0]+mat[1][1]+mat[2][2] == num;
    }
}
