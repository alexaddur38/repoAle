package guia5arreglos;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
       int n=3; 
       int i,j;
       int h=n;
       int [][] matriz = new int[n][n];
       int [] vectorF = new int[n];
       int [] vectorC = new int[n];
       int sumafila=0,sumacol=0,diagP=0,diagS=0;

       Scanner leer = new Scanner(System.in);
       System.out.println("cargue la matriz con numeros del 1 al 9 : ");
        
       for (i = 0; i < n; i++) {
             for (j = 0; j < n; j++) {
                  do {
                    matriz[i][j] = leer.nextInt();
                  } while (matriz[i][j] < 0 || matriz[i][j] > 9);     
             }
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        for (i = 0; i < n; i++) {
             for (j = 0; j < n; j++) {
                    sumafila+=matriz[i][j];
                    sumacol+= matriz[j][i];
                    if (i==j){
                        diagP+=matriz[i][j];  // SUMA DIAGONAL PRINCIPAL
                    }
             }
             //SUMA FILAS
             vectorF[i]=sumafila;
             sumafila=0;
             //SUMA COLUMNAS
             vectorC[i]=sumacol;
             sumacol=0;
             //DIAGONAL SECUNDARIA
             diagS+=matriz[i][h-1];
             h--;
        } 
        sumafila=0;
        sumacol=0;
        boolean bool=false;
        for (i = 0; i < n; i++) {
            sumafila = vectorF[i];
            sumacol = vectorC[i];
            if (diagP == diagS && diagP == sumafila && diagP == sumacol) {
                bool=true; 
            } else {
                System.out.println("No es una matriz magica"); 
                break;
            }
        }
        if (bool){
           System.out.println("Es una matriz magica"); 
        }
    }
}

/*Scanner leer = new Scanner(System.in);
    int matriz[][] = new int[3][3];
        System.out.println("Ingrese los valores de la matriz.");
   for (int i = 0; i < 3; i++) {     
    for (int j = 0; j < 3; j++) {
      matriz[i][j] = leer.nextInt();
    }
   }
    comprobar(matriz);
   
    }
public static void comprobar(int[][] matriz){
   boolean num = true;
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                num=false;
            }
   
        }
    }
    if (num==true) {
        calcularMagica(matriz);
        imprimirMatriz(matriz);
    }else{
        System.out.println("Error"); 
    }
}
  public static void calcularMagica(int[][] matriz){
int columna=0, fila=0, diagonal1=0, diagonal2=0;
      for (int i = 0; i < 3; i++) {
          columna=0;
          fila=0;
          for (int j = 0; j < 3; j++) {
              fila+= matriz[i][j];
              columna+=matriz[j][i];
              if (i==j) {
                  diagonal1+=matriz[i][j];
              }
              if (i+j==3) {
                  diagonal2+=matriz[i][j];
              }
          }
      }
      if ((diagonal1==diagonal2) || (fila==columna)) {
         System.out.println("La matriz es magica y la suma es: " +fila);
         
      }else{
         System.out.println("La matriz no es magica");
      }
}


public static void imprimirMatriz(int[][] matriz){
 System.out.println("Matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println("");
        }
        System.out.println(" ");
}
}
*/