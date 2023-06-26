import java.util.Scanner;

public class SumaVectoresScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = scanner.nextInt();

        int[] vector1 = leerVector(scanner, n, "Ingrese los elementos del primer vector:");
        int[] vector2 = leerVector(scanner, n, "Ingrese los elementos del segundo vector:");

        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }

        // Imprimir el resultado
        System.out.print("La suma de los vectores es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(resultado[i] + " ");
        }

        scanner.close();
    }

    private static int[] leerVector(Scanner scanner, int n, String mensaje) {
        System.out.println(mensaje);
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            vector[i] = scanner.nextInt();
        }

        return vector;
    }
}
