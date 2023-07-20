package maxi.guia_6;

public class Ejercicio_5 {

    public static void main(String[] args) {
        int [][]mat = {{0, 1, -2, 3},{-1, 0, -4, 5},{2, 4, 0, -6},{-3, -5, 6, 0}};
        
        
        boolean traspuesta = true;        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if(mat[i][j] + mat[j][i] != 0){
                    traspuesta = false;
                }                              
            } 
        }
        
        if(traspuesta){
            System.out.println("Es traspuesta");
        }else{
            System.out.println("No es traspuesta");
        }
    }

}
