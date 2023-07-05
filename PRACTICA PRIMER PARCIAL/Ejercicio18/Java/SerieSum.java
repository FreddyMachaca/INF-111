public class SerieSum {
    public static void main(String[] args) {
        double x = 0.5;  // Valor de x

        double sum = 0;
        double denominator = 4;

        for (int i = 1; i <= 10; i++) {
            sum += x / denominator;
            denominator += 4;
        }

        System.out.println("Suma: " + sum);
    }
}
