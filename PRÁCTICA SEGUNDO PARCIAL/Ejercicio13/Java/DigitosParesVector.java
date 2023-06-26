import java.util.ArrayList;
import java.util.Scanner;

public class DigitosParesVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        long numero = scanner.nextLong();

        ArrayList<Integer> digitosPares = obtenerDigitosPares(numero);

        // Imprimir el vector
        System.out.print("Los dígitos pares del número son: ");
        for (int i = 0; i < digitosPares.size(); i++) {
            System.out.print(digitosPares.get(i) + " ");
        }

        scanner.close();
    }

    private static ArrayList<Integer> obtenerDigitosPares(long numero) {
        ArrayList<Integer> digitosPares = new ArrayList<>();

        while (numero > 0) {
            long digito = numero % 10;
            if (digito % 2 == 0) {
                digitosPares.add((int) digito);
            }
            numero /= 10;
        }

        return digitosPares;
    }
}
