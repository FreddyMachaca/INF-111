import java.util.ArrayList;
import java.util.List;

public class SecuenciaGenerador {
    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();
        secuencia.add(3);
        secuencia.add(1);
        secuencia.add(2);

        int i = 3;
        while (secuencia.size() < n) {
            if (i % 2 == 1) {
                secuencia.add(secuencia.get(i - 2) + secuencia.get(i - 3));
            } else {
                secuencia.add(secuencia.get(i - 2) * 2);
            }
            i++;
        }

        return secuencia.subList(0, n);
    }

    public static void main(String[] args) {
        int nTerminos = 10;
        List<Integer> secuenciaGenerada = generarSecuencia(nTerminos);
        System.out.println(secuenciaGenerada);
    }
}