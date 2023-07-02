import java.util.ArrayList;
import java.util.List;

public class GenerarSerie {

    public static List<Integer> generarSerie(int n) {
        List<Integer> serie = new ArrayList<>();
        int valor = n;

        while (valor >= 0) {
            serie.add(valor);
            valor -= 5;
        }

        return serie;
    }

    public static void main(String[] args) {
        int n = 20;
        List<Integer> serie = generarSerie(n);

        for (int num : serie) {
            System.out.print(num + " ");
        }
    }
}
