import Biblioteca.Basicas;

public class Test5 {

    public static void main(String[] args) {

        System.out.println("Introduce una matriz: ");
        int[][] array = Basicas.fillFromKeyboard(3, 3);
        System.out.println("Introduce otra matriz: ");
        int[][] array2 = Basicas.fillFromKeyboard(3, 3);
        Basicas.print2DArray(array2);

        System.out.println("Suma de las matrices: ");
        Basicas.sumaArrays(array, array2);
        System.out.println("Resta de matrices: ");
        Basicas.restaArrays(array, array2);

    }

}
