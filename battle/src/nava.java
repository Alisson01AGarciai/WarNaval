import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class nava {
    public static Scanner lector = new Scanner(System.in);
    public static int puntosparajugador1= 0;
    public static int puntosparajugador2= 0;

    public static void main(String[] args) {

        boolean menu = false;
        while (!menu) {

            System.out.println("///// Bienvenido a batalla naval /////");
            System.out.println("--- batalla naval ---");
            System.out.println("1.- ----Iniciar juego ----");
            System.out.println("2.- salir");
            Scanner leer = new Scanner(System.in);
            int opc = leer.nextInt();

            if (opc == 1) {
//jugadores
                ArrayList<String> jugadores = new ArrayList<>();

                System.out.println("Agregar nombre de jugador 1: ");
                String jugador1 = leer.next();
                jugadores.add(jugador1);

                System.out.println("Agregar jugador 2: ");
                String jugador2 = leer.next();
                jugadores.add(jugador2);

                System.out.println("Los jugadores son: " + jugadores.get(0) + " y " + jugadores.get(1));
                Scanner s = new Scanner(System.in);

                int nfilas = 0, ncolumnas = 0, A = 0, B = 0;

                System.out.println("Ingrese el alto(filas) de su tablero");
                nfilas = s.nextInt();
                System.out.println("Ingrese el ancho(columnas) de su tablero");
                ncolumnas = s.nextInt();
//TABLERO
                int[][] tablero = new int[nfilas][ncolumnas];
                int[][] tableroj1 = new int[nfilas][ncolumnas];
                int[][] tableroj2 = new int[nfilas][ncolumnas];
                int[][] Tablero_contrario = new int[nfilas][ncolumnas];
                int[][] tablero__contrario = new int[nfilas][ncolumnas];

                System.out.println("Este es su tablero : ");
                for (int i = 0; i < nfilas; i++) {
                    for (int j = 0; j < ncolumnas; j++) {
                        System.out.print(" o ");
                    }
                    System.out.println(" ");
                }
//BARCOS

                System.out.println("Tiene 4 barcos");
                System.out.println("Ingrese el tamaño de sus barcos: ");
                int barcos = lector.nextInt();
                 //   int barcos = tablero;
                //   System.out.println("Ingrese los numeros de barcos de 1 a 4: ");
               // int barcos = leer.nextInt();
              //tiradas
                System.out.println("Este es su tablero : ");

                if (barcos == 1) {
                    System.out.println(" Jugador 1 ");
                    int player1 = 1;
                    botecitos(barcos, player1, A, B, tableroj1, nfilas, ncolumnas);
                    System.out.println(" Jugador 2 ");
                    int player2 = 2;
                    botecitos(barcos, player2, A, B, tableroj2, nfilas, ncolumnas);

                }
                else if (barcos == 2) {
                    System.out.println(" Jugador 1 ");
                    int player1 = 1;
                    botecitos(barcos, player1, A, B, tableroj1, nfilas, ncolumnas);
                    System.out.println(" Jugador 2 ");
                    int player2 = 1;
                    botecitos(barcos, player2, A, B, tableroj2, nfilas, ncolumnas);

                } else if (barcos == 3) {
                    System.out.println(" Jugador 1 ");
                    int player1 = 1;
                    botecitos(barcos, player1, A, B, tableroj1, nfilas, ncolumnas);
                    System.out.println(" Jugador 2 ");
                    int player2 = 1;
                    botecitos(barcos, player2, A, B, tableroj2, nfilas, ncolumnas);
                } else if (barcos == 4) {
                    System.out.println(" Jugador 1 ");
                    int player1 = 1;
                    botecitos(barcos, player1, A, B, tableroj1, nfilas, ncolumnas);
                    System.out.println("Jugador 2 ");
                    int player2 = 1;
                    botecitos(barcos, player2, A, B, tableroj2, nfilas, ncolumnas);
                }
//Aqui comienzan las tiradas//
                int tfil, tcolum, jug1, jug2, juga_dores =0;
                boolean tiradas = false;
                boolean tiradas2 = false;
                while (!tiradas) {
                    System.out.println("//////// Adivina jugador 1 ////////"+ jugadores.get(0));
                    System.out.println("Este es su tablero enemigo: ");
                    for (int i = 0; i < nfilas; i++) {
                        for (int j = 0; j < ncolumnas; j++) {
                            System.out.print(tablero__contrario[i][j] + " ");
                        }
                    }
                    System.out.println("x");
                } juga_dores = 1;
                tiradas = tiradas2 (tfil, tcolum, jug1, jug2, juga_dores);
                    if(tiradas) {
                        System.out.println("// Se ha terminado la partida //");
                        System.out.println("El ganador es el jugador: " + jugadores.get(0) + " con una puntuacion de: ");
                        tiradas = true;
                        menu = true;
                    }
                        juga_dores = 2;
                            tiradas = tiradas2 (tfil, tcolum, jug1, jug2, juga_dores);
                            if(tiradas){
                                System.out.println("// Se ha terminado la partida //" );
                                System.out.println("El ganador es el jugador: " + jugadores.get(0) + " con una puntuacion de: ");
                            }
                menu = true;
                tiradas = true;

                    }


            } else if (opc == 2) {
            tiradas = true;
             menu = true;
            }
        }
    }
    public static int verificacion (boolean verifi, int menu, int pos,int player1, int player2){
        while (!verifi) {
            if (pos >= player1 && pos >= player2) {
            } else {

            }
        }
        }
    //funcion PARA JUGADORES

    public static void botecitos(int barcos, int jugador, int A, int B, int[][] tablero, int nfilas, int ncolumnas) {

        if (jugador == 1) {
            System.out.println("Ingrese las cordenadas donde pondra sus barcos: ");
            for (int a = 0; a <= barcos - 1; a++) {

                System.out.println("Ingrese la posicion en fila del barco " + (a + 1));
                A = lector.nextInt();
                A -= 1;
                System.out.println("Ingrese la posicion en columna del barco " + (a + 1));
                B = lector.nextInt();
                B -= 1;
                System.out.println("Ingrese un numero identificador para su barco");
                tablero[A][B] = lector.nextInt();
            }
            jugador = 0;
            if (jugador == 0) {
                for (int i = 0; i < nfilas; i++) {
                    for (int j = 0; j < ncolumnas; j++) {
                        System.out.print(tablero[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        } else if (jugador == 2) {
            System.out.println("Ingrese las cordenadas donde pondra sus barcos_: ");
            for (int a = 0; a <= barcos - 1; a++) {

                System.out.println("Ingrese la posicion en fila del barco " + (a + 1));
                A = lector.nextInt();
                A -= 1;
                System.out.println("Ingrese la posicion en columna del barco " + (a + 1));
                B = lector.nextInt();
                B -= 1;
                System.out.println("Ingrese un numero identificador para su barco");
                tablero[A][B] = lector.nextInt();
            }
            jugador = 0;
            if (jugador == 0) {
                for (int i = 0; i < nfilas; i++) {
                    for (int j = 0; j < ncolumnas; j++) {
                        System.out.print(tablero[i][j] + " ");
                    }
                    System.out.println("");
                }
            }
        }

    }
}
