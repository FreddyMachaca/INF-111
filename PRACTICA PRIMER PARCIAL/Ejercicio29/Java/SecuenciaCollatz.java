import java.util.Scanner;

public class SecuenciaCollatz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de entrada
        System.out.print("Ingrese el número de casos de prueba: ");
        int t = scanner.nextInt();
        int[] casos = new int[t];
        for (int i = 0; i < t; i++) {
            System.out.print("Ingrese el número de inicio de la secuencia: ");
            casos[i] = scanner.nextInt();
        }

        // Procesamiento
        for (int n : casos) {
            int pasos = secuenciaCollatz(n);
            System.out.println(pasos);
        }
    }

    public static int secuenciaCollatz(int n) {
        int pasos = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n + 1;
            }
            pasos++;
        }
        return pasos;
    }
}