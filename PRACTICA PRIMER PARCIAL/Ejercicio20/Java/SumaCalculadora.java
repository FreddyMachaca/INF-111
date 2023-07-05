public class SumaCalculadora {
    public static void main(String[] args) {
        int n = 10; // Número de términos a sumar
        double resultado = calcularSuma(n);
        System.out.println("Resultado: " + resultado);
    }

    public static double calcularSuma(int n) {
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            double termino = (2 * i) / 5.0;
            suma += termino;
        }
        return suma;
    }
}
