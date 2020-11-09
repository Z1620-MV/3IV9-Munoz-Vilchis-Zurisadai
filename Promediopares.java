import java.util.*;

public class Promediopares {

  public static void main(String[] args) {
  
   Scanner entrada=new Scanner(System.in);
   
   int i;
   int[] numeros=new int[10];
   double promedio= 0;
   
   System.out.println("Ingrese los numeros deseados");
   for (i= 0; i < 10; i++){
     System.out.print("numeros [" + i + "]= ");
     numeros[i] = entrada.nextInt();
   }
   for (i = 0; i < 10; i++){
     if(i % 2 == 0){
       promedio=promedio+numeros[i];
     }
   }
   System.out.println("El promedio de los numeros que se encuentran en las posiciones pares es: " +promedio/5);
  }
}
