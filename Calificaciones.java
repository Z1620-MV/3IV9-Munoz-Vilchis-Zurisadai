import java.util.*;

 public class Calificaciones {

 public static void main(String[] args) {
  
 Scanner entrada = new Scanner(System.in);
 
 int i;
 int r=0;
 int a=0;
 double m=0;
 double n=0;
 double suma= 0;
 double media;
 double[] calificaciones= new double[10];
 
   System.out.println("Ingrese las calificaciones de los alumnos");
  
  for(i = 0; i < calificaciones.length; i++){
     System.out.println("Alumno["+ (i+1) +"]");
     calificaciones[i] = entrada.nextDouble();
   }  
   
   for(i = 0; i < calificaciones.length; i++){
    if(calificaciones[i] > m){
     m=calificaciones [i];
     System.out.println("La calificacion mas alta es: "+m);
    }
   }  
   
   for(i = 0; i < calificaciones.length; i++){
    if(calificaciones[i] < n){
     n=calificaciones [i];
     System.out.println("La calificacion mas baja es: "+n);
    }
    
   }  
   
   
    for(i = 0; i < calificaciones.length; i++){
     suma = suma + calificaciones[i];
   }  
   media = suma / calificaciones.length;
     System.out.println("La calificacion promedio del grupo es: " +media);
     
   for(i = 0; i < calificaciones.length; i++){
     if(calificaciones[i] > media){
       System.out.println("El alumno " + (i+1) + " Obtuvo una calificacion superior al promedio la cual fue:"+calificaciones[i]);
     }
   }  
    for(i = 0; i < calificaciones.length; i++){
    if(calificaciones[i] >= 6){
     System.out.println("Los alumnos que aprobaron fueron: "+(i+1) );
    }
   }  
   for(i = 0; i < calificaciones.length; i++){
    if(calificaciones[i] < 6){
     System.out.println("Los alumnos que reprobaron fueron: "+(i+1) );
     }
    }
  }
}
