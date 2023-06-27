import java.util.Scanner;

public class SustituirEspacios {
    public static String sustituirEspacios(String cadena) {
        String nuevaCadena = cadena.replace(" ", "$$$$$");
        return nuevaCadena;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        String cadenaSustituida = sustituirEspacios(cadena);
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena sustituida: " + cadenaSustituida);
        scanner.close();
    }
}
