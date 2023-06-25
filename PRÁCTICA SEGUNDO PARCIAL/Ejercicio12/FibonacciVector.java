public class FibonacciVector {
    public static void main(String[] args) {
        int n = 10; // Cantidad de números de la serie de Fibonacci a generar

        int[] fibonacci = new int[n];

        // Casos base
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        // Generar los números de Fibonacci
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        // Imprimir el vector
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
