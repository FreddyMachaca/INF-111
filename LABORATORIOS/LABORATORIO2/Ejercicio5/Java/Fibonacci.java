public class Fibonacci {
    public static int calcularSumaFibonacci(int n) {
        if (n <= 0) {
            return 0;
        }

        int suma = 0;
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            suma += a;
            int temp = a;
            a = b;
            b = temp + b;
        }

        return suma;
    }

    public static void main(String[] args) {
        int nTerminos = 8;
        int sumaFibonacci = calcularSumaFibonacci(nTerminos);
        System.out.println(sumaFibonacci);
    }
}
