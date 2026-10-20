import Biblioteca.Basicas;

public class Test1 {
    
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Introduce un numero de filas: ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Introduce un numero de columnas: ");
        java.util.Scanner fulgen = new java.util.Scanner(System.in);
        int cols = fulgen.nextInt();

        System.out.println("La matriz es una " + rows + "x" + cols);

        int[][] array = Basicas.fillFromKeyboard(rows, cols);
        System.out.println("La matriz introducida es: ");
        Basicas.print2DArray(array);

    }

}