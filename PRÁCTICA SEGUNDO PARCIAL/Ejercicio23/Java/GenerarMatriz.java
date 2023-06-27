public class GenerarMatriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 1, 0, 1, 1},
                {1, 1, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 1},
                {1, 1, 0, 1, 1}
        };

        // Mostrar la matriz
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
}
