import java.util.*;

public class Lectordieznum{

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int i;
        int p = 0, n = 0;
        int[]numeritos = new int[10];
        double sumap = 0, suman = 0;

        System.out.println("Ingrese los numeros");
        for (i = 0; i < 10; i++){
            System.out.print("numeritos dentro["+ i +"]=");
            numeritos[i] = entrada.nextInt();
        }
        for (i = 0; i < 10; i++){
            if(numeritos[i] > 0){
                sumap += numeritos[i];
                p++;
            }
            else{
                suman += numeritos[i];
                n++;
            }
        }
        if(p != 0){
            System.out.println("Resultado de los numeros positivos: " +sumap/p);
        }
        else{
            System.out.println("No ha tecleado numeros positivos");
        }
        if(p != 0){
            System.out.println("Resultado de los numeros negativos: " +suman/n);
            System.out.println("Gracias por venir :)");
        }
        else{
            System.out.println("No ha tecleado numeros negativoss");
        }
    }
}