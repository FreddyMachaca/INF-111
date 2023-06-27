public class Matriz {
    public static void main(String[] args) {
        int n = 5;  // Tamaño de la matriz cuadrada
        int[][] matriz = generarMatrizTriangularSuperior(n);
        imprimirMatriz(matriz);
    }

    public static int[][] generarMatrizTriangularSuperior(int n) {
        int[][] matriz = new int[n][n];
        int numero = 1;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                matriz[i][j] = numero;
                numero += 3;
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|");
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    System.out.print("     |");
                } else {
                    System.out.printf(" %3d |", matriz[i][j]);
                }
            }
            System.out.println("\n-------------------------------");
        }
    }
}
