
package guia5arreglos;


public class ejercicio1 {
/*Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.*/
  
    public static void main(String[] args) {
        
     int i;
     int[] vector = new int [100];
     for (i = 0 ; i < 100;  i++) {
         vector[i] = i+1;
     }  
     for (i = 100; i >0; i--) {
         System.out.println(vector[i-1]);
     }
    }
}
