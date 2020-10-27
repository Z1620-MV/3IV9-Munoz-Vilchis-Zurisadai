import java.util.Scanner;

class pokedex{
    //*3IV9-Muñoz Vilchis Zurisadai
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int opcion, opcionb;
        
        System.out.println("Bienvenido a Pokedex :))");
        System.out.println("1.- Datos de Charmander");
        System.out.println("2.- Datos de Bulbasaur");
        System.out.println("3.- Datos de Squartle");
        System.out.println("4.- Batalla Pokemon");
        System.out.println("5.- Salir");

        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
                System.out.println("ID: 19141918");
                System.out.println("Nombre: Charmander");
                System.out.println("Fuerza: 50");
                System.out.println("Defensa: Muro de piedra volcanica");
                System.out.println("Vida: 100%");
                System.out.println("Ataque principal: Bolitas de fuego");
                System.out.println("Ataque secundario: Lanzallamas");
                System.out.println("Si desea volver al menu aprete s");
                opcionb = entrada.nextInt();
                
            
            break;

            case 2:
                System.out.println("ID: 19391945");
                System.out.println("Nombre: Bulbasaur");
                System.out.println("Fuerza: 40");
                System.out.println("Defensa: Palmera");
                System.out.println("Vida: 100%");
                System.out.println("Ataque principal: Semillas");
                System.out.println("Ataque secundario: Hiedra venenosa");
            break;

            case 3:
                System.out.println("ID: 19451991");
                System.out.println("Nombre: Squartle");
                System.out.println("Fuerza: 60");
                System.out.println("Defensa: Caparazon");
                System.out.println("Vida: 100%");
                System.out.println("Ataque principal: Golpe de caparazon");
                System.out.println("Ataque secundario: Algas venenosas");
            break;

            case 4:
                System.out.println("¿A quien elegiras?");
                System.out.println("1.- Charmander vs Bulbasaur");
                System.out.println("2.- Charmander vs Squartle");
                System.out.println("3.- Bulbasaur vs Squartle");
                System.out.println("4.- Bulbasaur vs Charmander");
                System.out.println("5.- Squartle vs Bulbasaur");
                System.out.println("6.- Squartle vs Charmander");
                System.out.println("7.- Salir");
                //*Se me dificulto mucho termnarlo, porque mi laptop se estaba trabando. 
               
                opcion = entrada.nextInt();

                switch(opcion){

                    case 1:
                        System.out.println("Eres Charmander y estas peleando contra Bulbasaur");

                    break;

                    case 2:
                        System.out.println("Eres Charmander y estas peleando contra Squartle");
                    break;

                    case 3:
                        System.out.println("Eres Bulbasaur y estas peleando contra Squartle");
                    break;

                    case 4:
                        System.out.println("Eres Bulbasaur y estas peleando contra Charmander");
                    break;

                    case 5:
                        System.out.println("Eres Squartle y estas peleando contra Bulbasaur");
                    break;

                    case 6:
                        System.out.println("Eres Squartle y estas peleando contra Charmander");
                    break;

                    default:
                System.out.println("Gracias por venir, vuelva pronto :3");
                }

            break;
        
            default:
                System.out.println("Gracias por venir, vuelva pronto :3");
        }
    }
}    