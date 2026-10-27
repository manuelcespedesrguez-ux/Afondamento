import Biblioteca.Basicas;

public class Test7 {

    public static void main(String[] args) {
        
        System.out.println("--- Multiplicación de 3 matrices ---");
        System.out.println("Introduce la primera matriz: ");
        int[][] array = Basicas.fillFromKeyboard(3, 2);
        System.out.println("Introduce la segunda matriz: ");
        int[][] array2 = Basicas.fillFromKeyboard(2, 3);
        System.out.println("Introduce la tercera matriz");
        int[][] array3 = Basicas.fillFromKeyboard(3, 3);

        System.out.println("Multiplicación de matrices: ");
        Basicas.multiThreeArrays(array, array2, array3);

    }

}