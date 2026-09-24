package Biblioteca;

public class TestoBasicas {

    public static void main(String[] args) {

        System.out.println("Matriz no simétrica de 2x3: ");
        Basicas.print2DArray(Basicas.fillFromKeyboard(2, 3));
        System.out.println("Matriz no simétrica de 2x3 traspuesta: ");
        Basicas.print2DArray(Basicas.transpose(Basicas.fillFromKeyboard(2, 3)));

    }

}   
