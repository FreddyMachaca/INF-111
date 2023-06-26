public class SumaVectores {
    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {6, 7, 8, 9, 10};

        int n = vector1.length; // Ambos vectores deben tener la misma longitud

        int[] resultado = new int[n];

        for (int i = 0; i < n; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }

        // Imprimir el resultado
        System.out.print("La suma de los vectores es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(resultado[i] + " ");
        }
    }
}
