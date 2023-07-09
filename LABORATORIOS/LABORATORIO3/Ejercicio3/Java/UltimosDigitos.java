import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UltimosDigitos {
    public static List<Integer> mostrarUltimosDigitos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números en el lote: ");
        int n = scanner.nextInt();
        int[] lote = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            lote[i] = numero;
        }

        List<Integer> ultimosDigitos = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ultimoDigito = lote[i] % 10;
            ultimosDigitos.add(ultimoDigito);
        }

        return ultimosDigitos;
    }

    public static void main(String[] args) {
        List<Integer> resultado = mostrarUltimosDigitos();
        System.out.println("Los últimos dígitos son: " + resultado);
    }
}