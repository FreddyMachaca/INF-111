import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los elementos del vector de cadenas: ");
        ArrayList<String> vectorCadenas = obtenerVectorCadenas(scanner);

        System.out.print("Ingrese el elemento a buscar: ");
        String elementoX = scanner.nextLine();

        int contador = 0;
        for (String cadena : vectorCadenas) {
            if (cadena.equals(elementoX)) {
                contador++;
            }
        }

        System.out.println("El elemento " + elementoX + " aparece " + contador + " veces en el vector.");
    }

    private static ArrayList<String> obtenerVectorCadenas(Scanner scanner) {
        ArrayList<String> vector = new ArrayList<>();
        String[] elementos = scanner.nextLine().split(" ");
        for (String elemento : elementos) {
            vector.add(elemento);
        }
        return vector;
    }
}
