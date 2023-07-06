import java.util.Scanner;
import java.util.Arrays;

public class EliminarDigito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número X mayor que 100: ");
        int x = scanner.nextInt();

        if (x > 100) {
            String xStr = Integer.toString(x);
            char[] digits = xStr.toCharArray();
            Arrays.sort(digits);
            char minDigit = digits[0];
            String yStr = xStr.replaceFirst(Character.toString(minDigit), "");
            int y = Integer.parseInt(yStr);
            System.out.println("Y: " + y);
        } else {
            System.out.println("El número X no es mayor que 100.");
        }
    }
}