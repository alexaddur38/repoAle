package guia5array;

import java.util.Scanner;

public class ejercicio5 {

    /*Realice un programa en java que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A es antisimétrica
  cuando ésta es igual a su propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT. La matriz
  traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de elementos de la matriz : ");
        int n = leer.nextInt();
        int[][] matriz = new int[n][n];
        int[][] matrizT = new int[n][n];
        System.out.println("Cargue la matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento " + i + "," + j + " : ") ;
                matriz[i][j] = leer.nextInt();
            }
        }
         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }  
         System.out.println("");
        // traspuesta
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizT[i][j] = (matriz[j][i]*-1);
                System.out.print(matrizT[i][j] + " ");
            }
            System.out.println("");
        }
        
         
    }
}
/*
Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] trasp = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]= leer.nextInt();                
            }
       }        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trasp[i][j] = matriz[j][i];
            }
        }
        int cont=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j]==(-trasp[i][j])){
                cont++;
                }
            }
        }        
        if(cont==9){
            System.out.println("La matriz es antisimetrica");
        }else{
            System.out.println("La matriz No es antisimetrica");
        }
    }
}
*/


/*
public class Antisimetrica {

    public static void main(String[] args) {
        // Definimos la matriz a evaluar
        int[][] matriz = { { -1, 2, -3 }, { 0, -4, 5 }, { -6, 7, 8 } };
 
        // Comprobamos si la matriz es antisimétrica
        if (esAntisimetrica(matriz))
            System.out.println("La matriz es antisimétrica");
        else
            System.out.println("La matriz no es antisimétrica");
    }
 
    public static boolean esAntisimetrica(int[][] matriz) {
        // Comprobamos si la matriz es cuadrada
        if (matriz.length != matriz[0].length)
            return false;
 
        // Calculamos la traspuesta de la matriz
        int[][] traspuesta = traspuestaMatriz(matriz);
 
        // Comprobamos si la matriz es igual a su traspuesta cambiada de signo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != -traspuesta[i][j])
                    return false;
            }
        }
        return true;
    }
 
    public static int[][] traspuestaMatriz(int[][] matriz) {
        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++)
                traspuesta[j][i] = matriz[i][j];
        }
        return traspuesta;
    }
}
*/
