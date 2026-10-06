import Biblioteca.Basicas;

public class Test3 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {

        System.out.println("Introduce un numero de filas: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Introduce un numero de columnas: ");
        java.util.Scanner fulgen = new java.util.Scanner(System.in);
        int cols = fulgen.nextInt();

        int[][] matriz = Basicas.fillFromKeyboard(rows, cols);

        Basicas.trace(matriz);
        System.out.println("La traza de la matriz es: " + Basicas.trace(matriz));

        Basicas.isSymmetric(matriz);
        if (Basicas.isSymmetric(matriz)) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz no es simétrica");
        }

    }

}