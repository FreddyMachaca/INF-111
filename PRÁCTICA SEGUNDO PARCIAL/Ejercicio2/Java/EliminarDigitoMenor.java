import java.util.Scanner;

public class EliminarDigitoMenor {
    public static int eliminarDigitoMenor(int numero) {
        String cadena = Integer.toString(numero);
        char digitoMenor = Character.MAX_VALUE;
        for (char digito : cadena.toCharArray()) {
            if (digito < digitoMenor) {
                digitoMenor = digito;
            }
        }
        String nuevaCadena = cadena.replaceFirst(Character.toString(digitoMenor), "");
        return Integer.parseInt(nuevaCadena);
    }

    public static void eliminarDigitoMenorLote() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los números separados por espacios: ");
        String lote = scanner.nextLine();
        String[] numeros = lote.split(" ");
        for (String numero : numeros) {
            int numeroInt = Integer.parseInt(numero);
            int numeroSinDigito = eliminarDigitoMenor(numeroInt);
            System.out.println("El número " + numero + " sin el dígito menor es: " + numeroSinDigito);
        }
        scanner.close();
    }

    public static void main(String[] args) {
        eliminarDigitoMenorLote();
    }
}
