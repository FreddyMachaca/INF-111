import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los elementos del vector X: ");
        ArrayList<Integer> vectorX = obtenerVector(scanner);

        ArrayList<Integer> vectorInvertido = new ArrayList<>();
        ArrayList<Integer> vectorDigitosCentrales = new ArrayList<>();

        for (int numero : vectorX) {
            int numeroInvertido = Integer.parseInt(new StringBuilder(Integer.toString(numero)).reverse().toString());
            vectorInvertido.add(numeroInvertido);

            String numeroStr = Integer.toString(numero);
            String digitosCentrales = numeroStr.substring(1, numeroStr.length() - 1);
            vectorDigitosCentrales.add(Integer.parseInt(digitosCentrales));
        }

        System.out.println("Vector invertido: " + vectorInvertido);
        System.out.println("Vector dígitos centrales: " + vectorDigitosCentrales);
    }

    private static ArrayList<Integer> obtenerVector(Scanner scanner) {
        ArrayList<Integer> vector = new ArrayList<>();
        String[] elementos = scanner.nextLine().split(" ");
        for (String elemento : elementos) {
            vector.add(Integer.parseInt(elemento));
        }
        return vector;
    }
}
