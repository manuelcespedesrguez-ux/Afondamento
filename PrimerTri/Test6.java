import Biblioteca.Basicas;

public class Test6 {
    
    public static void main(String[] args) {
        
        System.out.println("--- MULTIPLICACIÓN DE MATRICES ---");
        System.out.println("Introduce la primera matriz: ");
        int[][] array = Basicas.fillFromKeyboard(3, 2);
        System.out.println("Introduce la segunda matriz: ");
        int[][] array2 = Basicas.fillFromKeyboard(2, 3);

        System.out.println("Multiplicación de matrices: ");
        Basicas.multiArrays(array, array2);

    }
    
}
