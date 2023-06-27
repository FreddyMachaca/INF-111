import java.util.ArrayList;
import java.util.Scanner;

public class VectoresIntercalar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los elementos del primer vector: ");
        ArrayList<Integer> vector1 = obtenerVector(scanner);

        System.out.print("Ingrese los elementos del segundo vector: ");
        ArrayList<Integer> vector2 = obtenerVector(scanner);

        System.out.print("Ingrese los elementos del tercer vector: ");
        ArrayList<Integer> vector3 = obtenerVector(scanner);

        ArrayList<Integer> vectorResultado = new ArrayList<>();

        int maxLength = Math.max(vector1.size(), Math.max(vector2.size(), vector3.size()));
        for (int i = 0; i < maxLength; i++) {
            if (i < vector1.size()) {
                vectorResultado.add(vector1.get(i));
            }
            if (i < vector2.size()) {
                vectorResultado.add(vector2.get(i));
            }
            if (i < vector3.size()) {
                vectorResultado.add(vector3.get(i));
            }
        }

        System.out.println("Vector resultado: " + vectorResultado);
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
