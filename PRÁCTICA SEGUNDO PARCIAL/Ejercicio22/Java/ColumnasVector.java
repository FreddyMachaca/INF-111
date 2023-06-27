import java.util.Scanner;

public class ColumnasVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            System.out.print("Ingrese los elementos de la fila: ");
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[] vectorSumaColumnas = new int[columnas];
        for (int j = 0; j < columnas; j++) {
            for (int i = 0; i < filas; i++) {
                vectorSumaColumnas[j] += matriz[i][j];
            }
        }

        System.out.print("Vector suma de columnas: ");
        for (int elemento : vectorSumaColumnas) {
            System.out.print(elemento + " ");
        }
    }
}