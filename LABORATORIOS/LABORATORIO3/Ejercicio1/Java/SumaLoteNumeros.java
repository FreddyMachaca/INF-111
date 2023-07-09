import java.util.Scanner;

public class SumaLoteNumeros {
    public static int sumarLoteNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números en el lote: ");
        int n = scanner.nextInt();
        int[] lote = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            lote[i] = numero;
        }

        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += lote[i];
        }

        return suma;
    }

    public static void main(String[] args) {
        int resultado = sumarLoteNumeros();
        System.out.println("La suma de los números es: " + resultado);
    }
}
