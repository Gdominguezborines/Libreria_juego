package Librerias;

import java.util.Scanner;

public class libreria {
    static Scanner teclado = new Scanner(System.in);

    //Insertamos una posicion de una matriz un simbolo concreto
    public static void insertarEn(char[][] matriz, int fila, int columna, char simbolo){

        matriz[fila][columna] = simbolo;

    }
    //pedimos un numero y lo devolvemos
    public static int pedirInteger(String mensaje){
        System.out.println(mensaje);
        int numero = teclado.nextInt();
        return numero;
    }
    //Rellenamos la matriz con un simbolo
    public static void rellenarMatriz (char [][] matriz, char simbolo){

        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]= simbolo;
            }
        }
    }
    //Indicamos si en una posicion hay una marca
    public static boolean hayValorPosicion(char[][] matriz, int fila, int columna, char simboloDef){
        if(matriz[fila][columna] != simboloDef){
            return true;
        }
        return false;
    }






}
