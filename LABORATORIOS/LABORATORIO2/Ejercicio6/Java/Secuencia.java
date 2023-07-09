public class Secuencia {
    public static int calcularSumaSecuencia(int n) {
        int suma = 0;
        int multiplicador = 1;

        for (int i = 1; i <= n; i++) {
            int termino = i * multiplicador;
            suma += termino;
            multiplicador *= -2;
        }

        return suma;
    }

    public static void main(String[] args) {
        int nTerminos = 6;
        int sumaSecuencia = calcularSumaSecuencia(nTerminos);
        System.out.println(sumaSecuencia);
    }
}