import java.util.Scanner;
import java.util.HashSet;

public class DigitosRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número X mayor que 100: ");
        int x = scanner.nextInt();

        if (x > 100) {
            String xStr = Integer.toString(x);
            HashSet<Character> digitosRepetidos = new HashSet<>();
            for (char digito : xStr.toCharArray()) {
                if (xStr.indexOf(digito) != xStr.lastIndexOf(digito)) {
                    digitosRepetidos.add(digito);
                }
            }
            System.out.print("Dígitos repetidos: ");
            for (Character digito : digitosRepetidos) {
                System.out.print(digito + ", ");
            }
            System.out.println();
        } else {
            System.out.println("El número X no es mayor que 100.");
        }
    }
}