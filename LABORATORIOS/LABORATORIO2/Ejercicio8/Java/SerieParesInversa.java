import java.util.ArrayList;
import java.util.List;

public class SerieParesInversa {
    public static List<Integer> generarSerieParesInversa(int n) {
        List<Integer> serie = new ArrayList<>();
        for (int i = n - 1; i > 0; i--) {
            if (i % 2 == 0) {
                serie.add(i);
            }
        }
        return serie;
    }

    public static void main(String[] args) {
        int n = 7;
        List<Integer> serieGenerada = generarSerieParesInversa(n);
        System.out.println(serieGenerada);
    }
}