import java.util.ArrayList;
import java.util.List;

public class GenerarSecuencia {

    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();
        int num = 2;

        while (secuencia.size() < n) {
            if (esPrimo(num)) {
                secuencia.add(num);
            }
            num++;
        }

        return secuencia;
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int nTerminos = 10;
        List<Integer> secuencia = generarSecuencia(nTerminos);

        for (int num : secuencia) {
            System.out.print(num + " ");
        }
    }
}
