import java.util.ArrayList;
import java.util.List;

public class GenerarSecuencia {

    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();
        int indice = 1;
        int incremento = 1;

        for (int i = 0; i < n; i++) {
            if (i % 3 == 2) {
                secuencia.add(-5);
            } else {
                secuencia.add(indice);
                indice += incremento;
                incremento++;
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
