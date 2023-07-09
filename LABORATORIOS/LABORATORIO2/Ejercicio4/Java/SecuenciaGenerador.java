import java.util.ArrayList;
import java.util.List;

public class SecuenciaGenerador {
    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();
        int contador = 0;

        for (int i = 0; i < n; i++) {
            secuencia.add(contador);
            if (contador == 0) {
                contador = 1;
            } else {
                contador = 0;
            }
        }

        return secuencia;
    }

    public static void main(String[] args) {
        int nTerminos = 12;
        List<Integer> secuenciaGenerada = generarSecuencia(nTerminos);
        System.out.println(secuenciaGenerada);
    }
}