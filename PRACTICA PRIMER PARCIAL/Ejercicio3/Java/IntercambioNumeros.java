import java.util.Scanner;

public class IntercambioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.println("Antes del intercambio:");
        System.out.println("Primer número: " + numero1);
        System.out.println("Segundo número: " + numero2);

        int auxiliar = numero1;
        numero1 = numero2;
        numero2 = auxiliar;

        System.out.println("Después del intercambio:");
        System.out.println("Primer número: " + numero1);
        System.out.println("Segundo número: " + numero2);

        scanner.close();
    }
}