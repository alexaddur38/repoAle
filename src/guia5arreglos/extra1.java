package guia5arreglos;

import java.util.Scanner;

public class extra1 {

    public static void main(String[] args) {
        /* Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
         */
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese el tamaño del vector");
        int num = leer.nextInt();

        int vector[] = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese los valores del vector");
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        System.out.println("La suma de los vectores es: " + suma);
    }
}

