package Librerias;
import java.util.Scanner;

public class libreria {

    /**
     * Muestra el turno de cada jugador
     *
     * @param turno
     */


    public static void mostrarTurnoActual(boolean turno) {
        if (turno) {
            System.out.println("Le toca alJugador 1");
        } else {
            System.out.println("Le toca al jugador 2");
        }
    }

    /**
     * Se valida la posicion insertada
     *
     * @param tablero
     * @param fila
     * @param columna
     * @return
     */


    public static boolean validarPosicion(char[][] tablero, int fila, int columna) {

        if (fila >= 0 && fila < tablero.length && columna >= 0 && columna < tablero.length) {
            return true;
        }
        return false;
    }

    /**
     * Muestra la matriz
     *
     * @param matriz
     */

    public static void mostrarMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }


    static Scanner teclado = new Scanner(System.in);

    //Insertamos una posicion de una matriz un determinado numero de fila y columna
    public static void insertarEn(char[][] matriz, int fila, int columna, char vacio) {

        matriz[fila][columna] = vacio;

    }

    //pedimos un numero y lo devolvemos
    public static int pedirInteger(String mensaje) {
        System.out.println(mensaje);
        int numero = teclado.nextInt();

        return numero;
    }

    //Rellenamos la matriz con la variable vacio -
    public static void rellenarMatriz(char[][] matriz, char vacio) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = vacio;
            }
        }
    }

    //Indicamos si una posicion esta ocupada o con la variable vacio -
    public static boolean hayValorPosicion(char[][] matriz, int fila, int columna, char vacio) {
        if (matriz[fila][columna] != vacio) {
            return true;
        }
        return false;
    }

    /**
     *  Muestra quien es el ganador de la partida
     * @param lineaGanadora
     * @param J1
     * @param J2
     * @param numeroGanador
     */

    public static void ganador (char lineaGanadora, char J1,char J2, int numeroGanador) {

        switch (numeroGanador) {

            case 1:
                if (lineaGanadora == J1) {
                    System.out.println("Gandor jugador 1 por linea");

                } else {
                    System.out.println("Gandor jugador 2 por linea");
                }
                break;

            case 2:
                if (lineaGanadora == J1) {
                    System.out.println("Gandor jugador 1 por columna");

                } else {
                    System.out.println("Gandor jugador 2 por columna");
                }
                break;

            case 3:
                if (lineaGanadora == J1) {
                    System.out.println("Gandor jugador 1 por diagonal");

                } else {
                    System.out.println("Gandor jugador 2 por diagonal");
                }
                break;

        }


    }






}
