import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciPrimosVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = scanner.nextInt();

        ArrayList<Integer> vector = generarVectorFibonacciPrimos(n);

        // Imprimir el vector
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }

        scanner.close();
    }

    private static ArrayList<Integer> generarVectorFibonacciPrimos(int n) {
        ArrayList<Integer> vector = new ArrayList<>();

        int contador = 0;
        int i = 1;

        while (contador < n) {
            if (contador % 2 == 0) {
                // Posición par: Número primo
                if (esPrimo(i)) {
                    vector.add(i);
                    contador++;
                }
            } else {
                // Posición impar: Número de Fibonacci
                vector.add(calcularFibonacci(i));
                contador++;
            }

            i++;
        }

        return vector;
    }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;
        int fibonacci = 0;

        for (int i = 2; i <= n; i++) {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }

        return fibonacci;
    }
}
