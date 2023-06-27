import java.util.Scanner;

public class EliminarDigitosMedio {
    public static int eliminarDigitosMedio(int numero) {
        String cadena = Integer.toString(numero);
        int longitud = cadena.length();
        if (longitud <= 2) {
            return 0;  // No hay dígitos del medio para eliminar
        } else if (longitud % 2 == 0) {
            int centro = longitud / 2;
            String nuevaCadena = cadena.substring(0, centro - 1) + cadena.substring(centro + 1);
            return Integer.parseInt(nuevaCadena);
        } else {
            int centro = longitud / 2;
            String nuevaCadena = cadena.substring(0, centro) + cadena.substring(centro + 1);
            return Integer.parseInt(nuevaCadena);
        }
    }

    public static void eliminarDigitosMedioLote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los números separados por espacios: ");
        String lote = scanner.nextLine();
        String[] numeros = lote.split(" ");
        for (String numero : numeros) {
            int numeroInt = Integer.parseInt(numero);
            int numeroSinDigitoMedio = eliminarDigitosMedio(numeroInt);
            System.out.println("El número " + numero + " sin el o los dígitos del medio es: " + numeroSinDigitoMedio);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        eliminarDigitosMedioLote();
    }
}
