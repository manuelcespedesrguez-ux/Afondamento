package Biblioteca;

public class Basicas {

    public static int[][] fillFromKeyboard(int rows, int cols) {
        java.util.Scanner sc =  new java.util.Scanner(System.in);
        int[][] array = new int[rows][cols];
        System.out.println("Añade "+ (rows * cols) + " números enteros: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]:");
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }

    // Funcion que imprime matriz de enteros
    public static void print2DArray (int[][] array) {
        for (int[] row : array) {
            System.out.print("| ");
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println("|");
        }
    }    

    public static void main(String[] args){
        System.out.println("Introduce un numero de filas: ");
        java.util.Scanner sc =  new java.util.Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Introduce un numero de columnas: ");
        java.util.Scanner fulgen =  new java.util.Scanner(System.in);
        int cols = fulgen.nextInt();

        System.out.println("La matriz es una " + rows + "x" + cols);

        // Esto me echaron una ayudita geremías, ya que no tenía ni puta idea //
        // de como mostrar la matriz completa en pantalla.
        int[][] array = fillFromKeyboard(rows, cols);
        System.out.println("La matriz introducida es: ");
        print2DArray(array);

    }

}