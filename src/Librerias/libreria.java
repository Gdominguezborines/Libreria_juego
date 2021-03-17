package Librerias;

import java.sql.SQLOutput;

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
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j< matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
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

}

