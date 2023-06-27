import java.util.Scanner;

public class ContarSignosExclamacion {
    public static int contarSignosExclamacion(String cadena) {
        int contador = 0;
        for (char caracter : cadena.toCharArray()) {
            if (caracter == '!') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        int cantidadSignos = contarSignosExclamacion(cadena);
        System.out.println("La cadena tiene " + cantidadSignos + " signos de exclamación.");
        scanner.close();
    }
}
