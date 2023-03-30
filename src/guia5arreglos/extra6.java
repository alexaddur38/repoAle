
package guia5arreglos;

import java.util.Scanner;

public class extra6 {

    public static void main(String[] args) {
        /*
        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario las va ingresando, construya una 
        “sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada
        de manera aleatoria. Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente
        imprima por pantalla la sopa de letras creada.
        Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().

         */
       int filaRandom, i, j;
        int  aleatorio=0;
        char[][] sopaLetras = new char[20][20];
        String[] palabras = new String[5];
        Scanner leer = new Scanner(System.in);

   
        for (i = 0; i < sopaLetras.length; i++) {
            for (j = 0; j < sopaLetras[i].length; j++) {
                aleatorio =(char) (int) (Math.random() * 10 );
                sopaLetras[i][j] =   (char) (aleatorio + '0'); 
            }
        }
        
        for ( i = 0; i < sopaLetras.length; i++) {
            for ( j = 0; j < sopaLetras[i].length; j++) {
                System.out.print(sopaLetras[i][j]); 
            }
            System.out.println(); 
        }

        for (i = 0; i < 5; i++) {
            System.out.print("Ingrese palabra " + (i + 1) + "  -> ");
            palabras[i] = leer.next();
            if (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres");
                i--;
            }

        }
        for (int k = 0; k < 5; k++) {
            
        
        filaRandom = (int) Math.round(Math.random() * (20 - 1));
        
          for ( i = 0; i < 5; i++) {
            int columna = (i * 3) + (20 - (3 * 5));  //Calculamos la columna en la que debe ubicarse la letra
            
            for ( j = 0; j < palabras[i].length(); j++) {
                sopaLetras[filaRandom][columna] = palabras[i].charAt(j); //Almacenamos la letra en la matriz
                columna++; //Aumentamos la columna para seguir almacenando letras
            }
          }
          
          
        for ( i = 0; i < sopaLetras.length; i++) {
            for ( j = 0; j < sopaLetras[i].length; j++) {
                System.out.print(sopaLetras[i][j]+"  "); 
            }
            System.out.println(); 
        }
     
    }

    }}

/*
import java.util.Scanner; //Importamos la librería Scanner para poder leer los datos ingresados por el usuario

public class extra6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Creamos un objeto Scanner para leer los datos ingresados por el usuario
        String [] palabras = new String[5]; //Declaramos un arreglo de 5 elementos donde se almacenarán las palabras del usuario
        int contador = 0; //Declaramos una variable que nos permitirá controlar el ingreso de palabras por parte del usuario
        int filaRandom; //Declaramos una variable para almacenar un número aleatorio que servirá para ubicar las palabras
        char[][] sopaLetras = new char[20][20]; //Declaramos una matriz de caracteres de 20x20
        
        //Ciclo para leer las palabras ingresadas por el usuario
        while (contador < 5) {
            System.out.println("Ingrese la palabra " + (contador + 1) + " de 5");
            palabras[contador] = sc.nextLine(); //Leemos la palabra y la almacenamos en el arreglo
            
            //Verificamos que la palabra tenga entre 3 y 5 caracteres
            if (palabras[contador].length() < 3 || palabras[contador].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres");
            } else {
                contador++; //Incrementamos el contador para seguir leyendo palabras
            }
        }
        
        //Generamos un número aleatorio entre 0 y 20 para ubicar las palabras
        filaRandom = (int) Math.round(Math.random() * (20 - 1));
        
        //Ciclo para ubicar las palabras en la matriz
        for (int i = 0; i < 5; i++) {
            int columna = (i * 3) + (20 - (3 * 5));  //Calculamos la columna en la que debe ubicarse la letra
            
            for (int j = 0; j < palabras[i].length(); j++) {
                sopaLetras[filaRandom][columna] = palabras[i].charAt(j); //Almacenamos la letra en la matriz
                columna++; //Aumentamos la columna para seguir almacenando letras
            }
        }
        
        //Ciclo para rellenar la matriz con números aleatorios
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                if (sopaLetras[i][j] == '\u0000') { //Comprobamos si la posición de la matriz está vacía
                    sopaLetras[i][j] = (char) ((int) Math.round(Math.random() * (9 - 0)) + '0'); //Si está vacía, llenamos la posición con un número aleatorio
                }
            }
        }
        
        //Ciclo para imprimir la matriz
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                System.out.print(sopaLetras[i][j]); //Imprimimos el carácter de la posición
            }
            System.out.println(); //Saltamos de línea para seguir imprimiendo
        }
    }
}
*/