package Librerias;
import java.util.Scanner;

public class libreria {

    /**
     * Muestra el turno de cada jugador
     *
     * @param turno
     */


    public void mostrarTurnoActual(boolean turno) {
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

    //Insertamos una posicion de una matriz un simbolo concreto
    public static void insertarEn(char[][] matriz, int fila, int columna, char simbolo) {

        matriz[fila][columna] = simbolo;

    }

    //pedimos un numero y lo devolvemos
    public static int pedirInteger(String mensaje) {
        System.out.println(mensaje);
        int numero = teclado.nextInt();
        return numero;
    }

    //Rellenamos la matriz con un simbolo
    public static void rellenarMatriz(char[][] matriz, char simbolo) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = simbolo;
            }
        }
    }

    //Indicamos si en una posicion hay una marca
    public static boolean hayValorPosicion(char[][] matriz, int fila, int columna, char simboloDef) {
        if (matriz[fila][columna] != simboloDef) {
            return true;
        }
        return false;
    }

}
