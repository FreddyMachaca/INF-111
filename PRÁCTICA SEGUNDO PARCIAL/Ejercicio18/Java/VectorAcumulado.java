import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los elementos del vector X: ");
        ArrayList<Integer> vectorX = obtenerVector(scanner);

        ArrayList<Integer> vectorSumaAcumulada = new ArrayList<>();
        int suma = 0;

        for (int numero : vectorX) {
            suma += numero;
            vectorSumaAcumulada.add(suma);
        }

        System.out.println("Vector suma acumulada: " + vectorSumaAcumulada);
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
