import java.util.Scanner;

public class NuevaSerie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de entrada
        System.out.print("Ingrese el número de términos de la serie: ");
        int n = scanner.nextInt();

        // Generar y mostrar la serie
        int[] serie = generarSerie(n);
        for (int i = 0; i < n; i++) {
            System.out.print(serie[i]);
            if (i != n - 1) {
                System.out.print(" ");
            }
        }
    }

    public static int[] generarSerie(int n) {
        int[] serie = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                serie[i] = 5 + i / 3 * 9;
            } else {
                serie[i] = 3 - i % 3 * 2;
            }
        }
        return serie;
    }
}