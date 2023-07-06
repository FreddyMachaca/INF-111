import java.util.Scanner;

public class PrimerUltimoDigito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número X mayor que 100: ");
        int x = scanner.nextInt();

        if (x > 100) {
            String xStr = Integer.toString(x);
            int primerDigito = Character.getNumericValue(xStr.charAt(0));
            int ultimoDigito = Character.getNumericValue(xStr.charAt(xStr.length() - 1));
            System.out.println("Primer dígito: " + primerDigito);
            System.out.println("Último dígito: " + ultimoDigito);
        } else {
            System.out.println("El número X no es mayor que 100.");
        }
    }
}
