
package guia5arreglos;

import java.util.Scanner;

public class ejercicio2 {
/*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. 
    El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */ 
    public static void main(String[] args) {
        int n,i,num,j;
        Scanner leer = new Scanner (System.in);
        System.out.print("Ingrese la cantidad de elementos del vector : ");
        n = leer.nextInt();
        int[] vector= new int[n];
        for (i = 0 ; i < n; i++) {
            vector[i] = (int) (Math.random() * 10+1);
        }
        for (i = 0 ; i < n; i++) {
            System.out.println("Elemento " + i + " = " + vector[i]);
         }
         System.out.print("Ing. el nro a buscar en el vector : ");
         num = leer.nextInt();
         for (i = 0 ; i < n; i++) {
             if (num == vector[i]) {
                  System.out.println("El nro " + num + " se encuentra en la posicion " + i );
                  j++;
             }
        }
        
        
    }
    
}
