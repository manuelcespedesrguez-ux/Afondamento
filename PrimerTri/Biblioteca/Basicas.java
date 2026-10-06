package Biblioteca;

public class Basicas {

    // funcion que rellena una matriz de enteros desde teclado
    public static int[][] fillFromKeyboard(int rows, int cols) {
        @SuppressWarnings("resource")
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int[][] array = new int[rows][cols];
        System.out.println("Añade " + (rows * cols) + " números enteros: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]:");
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    // Funcion que imprime matriz de enteros
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.print("| ");
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println("|");
        }
    }

    // funcion que traspone una matriz de enteros
    public static int[][] transpose(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = array[i][j];
            }
        }
        return transposed;
    }

    // funcion que devuelve la traza de una matriz de enteros cuadrada
    public static int trace(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (rows != cols) {
            throw new IllegalArgumentException("La matriz no es cuadrada");
        }
        int trace = 0;
        for (int i = 0; i < rows; i++) {
            trace += array[i][i];
        }
        return trace;
    }

    // funcion que devuelve si la matriz es simetrica o no
    public static boolean isSymmetric(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (rows != cols) {
            return false;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] != array[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    // comprobar si la matriz es diagonal y su traza
    public static void isDiagonal(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (rows != cols) {
            System.out.println("La matriz no es cuadrada");
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i != j && array[i][j] != 0) {
                    System.out.println("La matriz no es diagonal");
                    return;
                }
            }
        }
        System.out.println("La matriz es diagonal y su traza es: " + trace(array));
    }

}