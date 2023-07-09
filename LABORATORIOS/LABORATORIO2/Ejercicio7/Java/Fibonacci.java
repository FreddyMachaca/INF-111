public class Fibonacci {
    public static int calcularProductoFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }

        int producto = 1;
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            producto *= a;
            int temp = a;
            a = b;
            b = temp + b;
        }

        return producto;
    }

    public static void main(String[] args) {
        int nTerminos = 8;
        int productoFibonacci = calcularProductoFibonacci(nTerminos);
        System.out.println(productoFibonacci);
    }
}