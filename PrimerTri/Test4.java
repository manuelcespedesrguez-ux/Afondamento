import Biblioteca.Basicas;

public class Test4 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println("Introduce un numero de filas: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Introduce un numero de columnas: ");
        java.util.Scanner fulgen = new java.util.Scanner(System.in);
        int cols = fulgen.nextInt();

        int[][] matriz = Basicas.fillFromKeyboard(rows, cols);

        Basicas.isDiagonal(matriz);
    }
}