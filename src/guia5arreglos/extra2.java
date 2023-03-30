package guia5arreglos;

public class extra2 {

   
    public static void main(String[] args) {
      /*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte
        alguna diferencia entre los elementos).
        */
      int n=0;
      int [] vector1 = new int [n];
      int [] vector2= new int [n];
        System.out.println("CARGAR VECTORES");
       for (int i = 0; i < n; i++) {
           System.out.print("Elemento " + i + "vector 1 : ");
            vector1[i] = leer.nextInt();
            System.out.print("Elemento " + i + "vector 2 : ");
            vector2[i] = leer.nextInt();
            if (vector)
        }
      
    }
    
    /*
    
    */
    
}
/*Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int num = leer.nextInt();
  boolean iguales = true;
        
        int vector1[] = new  int[num];
        int vector2[] = new int[num];
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("ingrese los valores del primer vector");
            vector1[i]=  leer.nextInt();
            System.out.println("Ingrese los valores del vector 2");
            vector2[i]= leer.nextInt();
            if (vector1[i]!=vector2[i]) {
                iguales=false;
                break;
            }
        }
        if ( iguales ) {
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores son distintos");
        }
}
}
*/