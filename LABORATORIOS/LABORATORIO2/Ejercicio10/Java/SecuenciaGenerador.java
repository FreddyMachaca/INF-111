import java.util.ArrayList;
import java.util.List;

public class SecuenciaGenerador {
    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();
        int contador = 0;
        int repeticiones = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < repeticiones; j++) {
                secuencia.add(contador);
            }
            contador = 1 - contador;
            repeticiones++;
        }

        return secuencia.subList(0, n);
    }

    public static void main(String[] args) {
        int nTerminos = 10;
        List<Integer> secuenciaGenerada = generarSecuencia(nTerminos);
        System.out.println(secuenciaGenerada);
    }
}