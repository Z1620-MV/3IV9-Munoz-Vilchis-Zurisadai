import java.util.*;

public class Datos{

    Scanner entrada = new Scanner(System.in);

    String[] nombre = new String [10];
    String[] id = new String [10];
    String puesto;
    int i;
    int e=0;
    int f=0;
    double s;
    double sueldo[] = new double [10];

    public void Lector(){

        System.out.println("Ingresa los nombres de los trabajadores");
  
 
        for(i = 0; i < sueldo.length; i++){
            System.out.println("Nombre de el/la empleado/a " + (i+1) +".");
        nombre[i]=entrada.nextLine();
            }
            
            for(i = 0; i < sueldo.length; i++){
        System.out.println("Ingresa el id de los empleados");
            id[i]=entrada.nextLine();
            }
            
        System.out.println("Ingresa los salarios segun el orden anterior, recuerde 5000$ a empleados normales y 8000$ a supervisores ");
        for(i = 0; i < sueldo.length; i++){
        System.out.println(" ");
            System.out.println("Salario [" + (i+1) +"]");
            sueldo[i]=entrada.nextDouble();
        System.out.println("El sueldo corresponde a el/la empleado/a: " +nombre[i]);
            
            if(sueldo[i]==5000){
            System.out.println("El puesto de " +nombre[i]+ " es empleado/a normal");      
            }else{
            if(sueldo[i]==8000){
            System.out.println("El puesto de " +nombre[i]+ " es supervisor(a)");      
            }else{
            System.out.println("El salario no corresponde con ningun puesto por lo que se deduce que no perteneces a esta empresa :)");
            }   
            }
        }
        }
        
        public void Ejecutador(){
        
        System.out.println("La suma de los salarios son ");
        for(i = 0; i < sueldo.length; i++){
        if(sueldo[i]==5000){
        System.out.println(" ");
        System.out.println("Hola, " +id[i]+ " ingresa las horas diurnas que se trabajaron en esta quincena ");
        
        e= entrada.nextInt();
        
        System.out.println("Ahora " +id[i]+ " ingresa las horas nocturnas que se trabajaron en esta quincena ");
        f= entrada.nextInt();
        
        s= (e*50)+(f*60)+5000;
        
        System.out.println("El salario total de " +nombre[i]+ " es " +s);  
        System.out.println(" ");    
        
            
            }else{
            if(sueldo[i]==8000){
            System.out.println("El puesto de el/la empleado/a " +nombre[i]+ " es supervisor(a)");      
            
            s=8000-(8000*0.001)-(8000*0.002)-(0.0016*8000);
            
            System.out.println("El salario de el/la empleado/a " +id[i]+ " es " +s);         
            
            }
        }   
        }


    }



}