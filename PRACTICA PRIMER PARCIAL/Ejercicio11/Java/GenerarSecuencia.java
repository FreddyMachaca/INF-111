import java.util.ArrayList;
import java.util.List;

public class GenerarSecuencia {

    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (contador == 3) {
                secuencia.add(0);
                contador = 0;
            } else {
                secuencia.add(1);
                contador++;
            }
        }

        return secuencia;
    }

    public static void main(String[] args) {
        int nTerminos = 20;
        List<Integer> secuencia = generarSecuencia(nTerminos);

        for (int num : secuencia) {
            System.out.print(num + " ");
        }
    }
}
