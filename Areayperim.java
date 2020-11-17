import java.util.*;

public class Areayperim{
    Scanner entrada = new Scanner(System.in);
    int r, br, hr, lc, bt, lt, ht;
    double ac, pc, ar, pr, acu, pcu, at, pt; 

    public void Datos (){
        
        System.out.println("Deme el radio del circulo");
        r = entrada.nextInt();
        System.out.println("Deme el valor de la base del rectangulo");
        br = entrada.nextInt();
        System.out.println("Deme el valor de la altura del rectangulo");
        hr = entrada.nextInt();
        System.out.println("Deme el valor de uno de los lados del cuadrado");
        lc = entrada.nextInt();
        System.out.println("Deme el valor de la base del triangulo");
        bt = entrada.nextInt();
        System.out.println("Deme el valor de la altura del triangulo");
        ht = entrada.nextInt();
        System.out.println("Deme el valor de uno de los lados del triangulo");
        lt = entrada.nextInt();
    }
   
    public void Operacion(){
        ac = 3.1416*(r*r);
        pc = 2*3.1416*r;
        ar = br*hr;
        pr = (br*2)+(hr*2);
        acu = lc*lc;
        pcu = lc*4;
        at = (bt*ht)/2;
        pt = bt+lt+lt;
       
    }

    public void Resultados(){
        
        System.out.println("El area del circulo es de: " +ac);
        System.out.println("El perimetro del circulo es de: " +pc);
        System.out.println("El area del rectangulo es de: " +ar);
        System.out.println("El perimetro del rectangulo es de: " +pr);
        System.out.println("El area del cuadrado es de: " +acu);
        System.out.println("El perimetro del cuadrado es de: " +pcu);
        System.out.println("El area del triangulo es de: " +at);
        System.out.println("El perimetro del triangulo es de: " +pt);
        System.out.println("Gracias por venir"); 
    }
}