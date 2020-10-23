import java.util.Scanner;

class FigurasMenu6{

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int altura, base, lado1, lado2, diagonal1, diagonal2;
        double resultado, perimetro;

        System.out.println("Bienvenido al programa de calculo de areas y perimetros");
        System.out.println("Elija una de las siguientes opciones:");
        System.out.println("1.- Calcular area y perimetro de un cuadrado");
        System.out.println("2.- Calcular area y perimetro de un triangulo");
        System.out.println("3.- Calcular area y perimetro de un circulo");
        System.out.println("4.- Calcular area y perimetro de un rectangulo");
        System.out.println("5.- Calcular area y perimetro de un rombo");
        System.out.println("6.- Calcular area y perimetro de un hexagono");
        System.out.println("7.- Salir");

        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                System.out.println("Ingresa el valor de un lado");
                base = entrada.nextInt();
                resultado = base*base;
                perimetro = base+base+base+base;
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro);
                break;

            case 2:
                System.out.println("Ingresa el valor de la base");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                System.out.println("Ingrese el valor de un lado");
                lado1 = entrada.nextInt();
                System.out.println("Ingrese el valor del otro lado");
                lado2 = entrada.nextInt();
                resultado = (base*altura)/2;
                perimetro = base+lado1+lado2;
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro);
                break;

            case 3:
                System.out.println("Ingresa el valor del radio");
                base = entrada.nextInt();
                resultado = 3.1416*(base*base);
                perimetro = 2*3.1416*base;
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro);
                break;

            case 4:
                System.out.println("Ingresa el valor de un lado");
                base = entrada.nextInt();
                System.out.println("Ingresa el valor de la altura");
                altura = entrada.nextInt();
                resultado = base*altura;
                perimetro = 2*(base+altura);
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro);
                break;

            case 5:
                System.out.println("Ingresa el valor de la diagonal mayor");
                diagonal1 = entrada.nextInt();
                System.out.println("Ingresa el valor de la diagonal menor");
                diagonal2 = entrada.nextInt();
                System.out.println("Ingresa el valor de uno de sus lados");
                lado1 = entrada.nextInt();
                resultado = (diagonal1*diagonal2)/2;
                perimetro = lado1+lado1+lado1+lado1;
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro);
                break;
            
            case 6:
                System.out.println("Ingresa el valor de un lado");
                lado1 = entrada.nextInt();
                System.out.println("Ingresa el valor del apotema");
                base = entrada.nextInt();
                perimetro = lado1+lado1+lado1+lado1;
                resultado = (perimetro*base)/2;
                System.out.println("El area es de: "+resultado);
                System.out.println("El perimetro es de: "+perimetro);
                break;

            default:
                System.out.println("Gracias por venir");
        }
    }
}