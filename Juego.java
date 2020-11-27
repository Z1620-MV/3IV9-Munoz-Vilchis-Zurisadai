import java.util.*;

public class Juego {


    private Tablero G;
    private Scanner entrada;

    public Juego() {
        G = new Tablero();
        entrada = new Scanner(System.in);
    }

    public void menu() {


        for (;;) {
            
            System.out.println("Buscaminas <3");           
            System.out.println("1.-Jugar");
            System.out.println("2.- Salir");           
            System.out.println("Elige la opcion:");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    jugar();
                    break;
                case 2:
                    System.exit(0);
            }
        }
    }

    public void jugar() {
       
        G.LlenarT();
        G.Mostrar();
        int fila, columna;
        int aciertos = 0;
        int objetivo=G.SMinas();
        boolean salir = false;
        System.out.println("cantidad de casillas sin minas: "+G.SMinas());
        do {
            System.out.println("Elige un casillas : ");
            System.out.println("Ingresando sus coordenadas");
            System.out.println("Fila: ");
            fila = entrada.nextInt();
            System.out.println("Columna:");
            columna = entrada.nextInt();
            System.out.println("La casilla elegido es: [" + fila + "][" + columna + "]");
            if (G.Reverso(fila, columna)) {
                G.Mostrar();
                aciertos++;
                System.out.println("aciertos: "+aciertos);
                if (aciertos ==objetivo ) {
                    System.out.println("Has Ganado el Juego");
                    salir = true;
                }
            } else {
                System.out.println("Ha perdido");
                salir=true;
            }
        } while (!salir);



    }
}