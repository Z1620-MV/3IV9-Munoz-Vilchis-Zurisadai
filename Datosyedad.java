import java.util.*;

public class Datosyedad{
    Scanner entrada = new Scanner(System.in);
    String nombre, apellidom, apellidop, pais;
    int anio, edad;

    public void Datos (){
        
        System.out.println("Digame su nombre");
        nombre = entrada.nextLine();
        System.out.println("Digame su apellido materno");
        apellidom = entrada.nextLine();
        System.out.println("Digame su apellido paterno");
        apellidop = entrada.nextLine();
        System.out.println("Digame de que pais es");
        pais = entrada.nextLine();
        System.out.println("Digame en que anio nacio (con los cuatro digitos)");
        anio = entrada.nextInt();
       
    }
   
    public void Operacion(){
        
        edad = 2020 - anio;

        System.out.println("Usted se llama: " + nombre + " " + apellidom + " " + apellidop );
        System.out.println("Usted es de " + pais);
        System.out.println("Usted tiene o esta por cumplir " + edad + " anios");  
        System.out.println("Gracias por venir"); 
    }
}