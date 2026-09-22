package Biblioteca;

public class Basicas {

    public static int[][] fillFromKeyboard(int rows, int cols) {
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

    // funcion hace la traspuesta
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

    // funcion para comprobar si es simetrica
    public static boolean isSimetrica(int[][] array) {
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
}
