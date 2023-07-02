import java.util.ArrayList;
import java.util.List;

public class GenerarSecuencia {

    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();
        secuencia.add(1);
        secuencia.add(3);
        int indice = 1;

        for (int i = 2; i < n; i++) {
            if (i % 2 == 0) {
                indice++;
            } else {
                indice += 2;
            }

            secuencia.add(indice);
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
