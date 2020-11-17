import java.util.*;
import java.util.Scanner;

public class Llamadas{
    
    public static void main(String[] args){
    
        Scanner entrada = new Scanner(System.in);
        float Noc;
        double cred, sala;
        int  opcion, nuev;
        double lnacionales = 0.50, linternacionales = 0.60, celulares = 0.20;

        System.out.println("Ingrese su numero de telefono");
        Noc = entrada.nextFloat();
        System.out.println("Ingrese su credito actual Ej. $2.75");
        cred = entrada.nextDouble();
        System.out.println("A donde desea realizar su llamada");
        System.out.println("1. Local-Nacional");
        System.out.println("2. Local-Internacional");
        System.out.println("3. Celular");
        System.out.println("4. Meter saldo");

        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                sala = cred-lnacionales;
                System.out.println("La llamada local-nacional tuvo un costo de $0.5 y su saldo ahora es de: $" +sala);
                break;
            case 2:
                sala = cred-linternacionales;
                System.out.println("La llamada local-internacional tuvo un costo de $0.6 y su saldo ahora es de: $" +sala);
                break;
            case 3:
                sala = cred-celulares;
                System.out.println("La llamada celular tuvo un costo de $0.2 y su saldo ahora es de: $" +sala);   
                break;
            case 4:
                System.out.println("Ingrese la cantidad que quiere recargar (Ej.50, 20)");
                nuev = entrada.nextInt();
                sala = cred+nuev;
                System.out.println("Usted tenia "+cred+ " y con su recarga de "+nuev+". Ahora tiene "+sala);   
                break;   
        }

    }
}