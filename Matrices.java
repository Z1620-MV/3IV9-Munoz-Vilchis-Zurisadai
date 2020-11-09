import java.util.Scanner;

public class Matrices {

  public static void main(String[] args) {
  
  Scanner entrada=new Scanner(System.in);
  int z;
  int m;
  int matriza[][]= new int[3][3];
  int matrizb[][]= new int[3][3];
  int matrizc[][]= new int[3][3];
  
  System.out.println("Los datos de la matriz A son");
  
  for(z=0; z<= 2; z++){
    for(m=0; m<= 2; m++){
      System.out.print("Escribir el valor de la fila " + z +" y de la columna " + m +": ");
      matriza[z][m]= entrada.nextInt();
    }
   }
   System.out.println("Los datos de la matriz B son");
  
  for(z=0; z<= 2; z++){
    for(m=0; m<= 2; m++){
      System.out.print("Escribir el valor de la fila " + z +" y de la columna " + m +": ");
      matrizb[z][m]= entrada.nextInt();
    }
   }
   for(z=0; z<= 2; z++){
       
    for(m=0; m<= 2; m++){
      matrizc[z][m]= matriza[z][m]+matrizb[z][m];
    }
   }
   
   System.out.println("La matriz S, resultante de la suma es : ");
   
    for(z=0; z<= 2; z++){
    for(m=0; m<= 2; m++){
      System.out.print(matrizc[z][m]+ ":");
    }
   }
   
  }
}
