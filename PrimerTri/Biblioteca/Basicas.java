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

    // funcion de suma y resta
    public static void sumaArrays(int[][] array, int[][] array2) {
        int rows = array.length;
        int cols = array[0].length;

        if (rows != array2.length || cols != array2[0].length) {
            System.out.println("Las matrices deben tener las mismas dimensiones para sumarse.");
            return;
        }

        int[][] resultado = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultado[i][j] = array[i][j] + array2[i][j];
            }
        }

        print2DArray(resultado);
    }

    public static void restaArrays(int[][] array, int[][] array2) {
        int rows = array.length;
        int cols = array[0].length;

        if (rows != array2.length || cols != array2[0].length) {
            System.out.println("Las matrices deben tener las mismas dimensiones para restarse.");
            return;
        }

        int[][] resultado = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultado[i][j] = array[i][j] - array2[i][j];
            }
        }

        print2DArray(resultado);
    }

    // funcion multiplicación
    public static void multiArrays(int[][] array, int[][] array2) {

        int rows1 = array.length;
        int cols1 = array[0].length;
        int rows2 = array2.length;
        int cols2 = array2[0].length;

        if (cols1 != rows2) {
            System.out.println("Las matrices deben coincidir en columnas o filas para poder multiplicarse");
            return;
        }

        int[][] resultado = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) { // Filas de A rows = 2
            for (int j = 0; j < cols2; j++) { // Columnas de B cols =2
                for (int k = 0; k < cols1; k++) { // Elementos compartidos= 3 (columnas de A / filas de B)
                    resultado[i][j] += array[i][k] * array2[k][j];
                }
            }
        }

        print2DArray(resultado);

    }

    // Multiplicacion de 3 matrices
    public static void multiThreeArrays(int[][] arrayA, int[][] arrayB, int[][] arrayC) {
        int rowsA = arrayA.length;
        int colsA = arrayA[0].length;
        int rowsB = arrayB.length;
        int colsB = arrayB[0].length;
        int rowsC = arrayC.length;
        int colsC = arrayC[0].length;

        if (colsA != rowsB || colsB != rowsC) {
            System.out.println("Error en las dimensiones:");
            System.out.println("- Las columnas de A deben coincidir con las filas de B.");
            System.out.println("- Las columnas de B deben coincidir con las filas de C.");
            return;
        }

        int[][] tempResult = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) { 
                    tempResult[i][j] += arrayA[i][k] * arrayB[k][j];
                }
            }
        }

        int[][] finalResult = new int[rowsA][colsC]; 
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsC; j++) {
                for (int k = 0; k < colsB; k++) {
                    finalResult[i][j] += tempResult[i][k] * arrayC[k][j]; 
                }
            }
        }

        print2DArray(finalResult);
    }
}