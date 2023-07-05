public class SerieSum {
    public static void main(String[] args) {
        double x = 0.5;  // Valor de x

        double sum = 0;
        double numerator = 2;
        double denominator = 2;
        int sign = 1;

        for (int i = 1; i <= 10; i++) { 
            double term = (numerator * Math.pow(2, i)) / factorial(denominator);
            sum += sign * term;
            denominator += 2;
            sign *= -1;
        }

        System.out.println("Suma: " + sum);
    }

    public static double factorial(double n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
