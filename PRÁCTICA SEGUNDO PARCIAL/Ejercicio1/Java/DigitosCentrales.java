import java.util.Scanner;

public class DigitosCentrales {

    public static String obtenerDigitosCentrales(int numero) {
        // Convierte el número en una cadena de caracteres
        String numeroStr = Integer.toString(numero);
        int longitud = numeroStr.length();

        // Calcula el índice del dígito central o dígitos centrales
        int indiceCentral = longitud / 2;

        if (longitud % 2 == 0) {
            // Si la longitud es par, devuelve los dos dígitos centrales
            String digitosCentrales = numeroStr.substring(indiceCentral - 1, indiceCentral + 1);
            return digitosCentrales;
        } else {
            // Si la longitud es impar, devuelve el dígito central
            String digitoCentral = Character.toString(numeroStr.charAt(indiceCentral));
            return digitoCentral;
        }
    }

    public static void mostrarDigitosCentrales(int[] loteNumeros) {
        for (int numero : loteNumeros) {
            String digitosCentrales = obtenerDigitosCentrales(numero);
            System.out.println("Los dígitos centrales del número " + numero + " son: " + digitosCentrales);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números en el lote: ");
        int n = scanner.nextInt();

        int[] numeros = new int[n];
        System.out.println("Ingrese los números del lote, separados por espacios:");

        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }

        mostrarDigitosCentrales(numeros);
    }
}
