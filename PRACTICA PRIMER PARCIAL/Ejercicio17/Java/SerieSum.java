public class SerieSum {
    public static void main(String[] args) {
        double x = 0.5;  // Valor de x

        double sum = 0;
        double fraction = 2;

        for (int i = 1; i <= 10; i++) { // 10 iteraciones
            sum += x / fraction;
            fraction *= 2;
        }

        System.out.println("Suma: " + sum);
    }
}
