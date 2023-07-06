import java.util.Scanner;

public class KEsimoDigito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lectura de entrada
        System.out.print("Ingrese el número N y el dígito K separados por un espacio: ");
        long n = scanner.nextLong();
        int k = scanner.nextInt();

        
        long[] resultados = obtenerKesimoDigito(n, k);
        long cantidadDigitos = resultados[0];
        long kEsimoDigito = resultados[1];

        
        System.out.println("Cantidad de dígitos: " + cantidadDigitos);
        System.out.println("El dígito " + k + " es: " + kEsimoDigito);
    }

    public static long[] obtenerKesimoDigito(long n, int k) {
        String numStr = Long.toString(n);
        long cantidadDigitos = numStr.length();
        long kEsimoDigito = Character.getNumericValue(numStr.charAt(k - 1));
        return new long[]{cantidadDigitos, kEsimoDigito};
    }
}
