import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factoriales {
    public static int calcularFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calcularFactorial(n - 1);
        }
    }

    public static List<Integer> calcularFactorialesLote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números en el lote: ");
        int n = scanner.nextInt();
        int[] lote = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            lote[i] = numero;
        }

        List<Integer> factoriales = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int factorial = calcularFactorial(lote[i]);
            factoriales.add(factorial);
        }

        return factoriales;
    }

    public static void main(String[] args) {
        List<Integer> resultado = calcularFactorialesLote();
        System.out.println("Los factoriales de los números son: " + resultado);
    }
}