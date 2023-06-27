import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los elementos del primer vector ordenado: ");
        ArrayList<Integer> vector1 = obtenerVector(scanner);

        System.out.print("Ingrese los elementos del segundo vector ordenado: ");
        ArrayList<Integer> vector2 = obtenerVector(scanner);

        ArrayList<Integer> vectorUnion = new ArrayList<>();
        vectorUnion.addAll(vector1);
        vectorUnion.addAll(vector2);
        Collections.sort(vectorUnion);

        System.out.println("Vector union ordenado: " + vectorUnion);
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
