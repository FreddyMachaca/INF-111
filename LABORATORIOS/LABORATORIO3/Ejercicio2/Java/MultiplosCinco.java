import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultiplosCinco {
    public static List<Integer> mostrarMultiplosDeCinco() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números en el lote: ");
        int n = scanner.nextInt();
        int[] lote = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            lote[i] = numero;
        }

        List<Integer> multiplosDeCinco = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (lote[i] % 5 == 0) {
                multiplosDeCinco.add(lote[i]);
            }
        }

        return multiplosDeCinco;
    }

    public static void main(String[] args) {
        List<Integer> resultado = mostrarMultiplosDeCinco();
        System.out.println("Los múltiplos de 5 son: " + resultado);
    }
}