import java.util.Scanner;

public class EliminarVocales {
    public static String eliminarVocales(String cadena) {
        String vocales = "aeiouAEIOU";
        StringBuilder nuevaCadena = new StringBuilder();
        for (char caracter : cadena.toCharArray()) {
            if (vocales.indexOf(caracter) == -1) {
                nuevaCadena.append(caracter);
            }
        }
        return nuevaCadena.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        String cadenaSinVocales = eliminarVocales(cadena);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena sin vocales: " + cadenaSinVocales);
        scanner.close();
    }
}
