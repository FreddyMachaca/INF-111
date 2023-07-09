import java.util.ArrayList;
import java.util.List;

public class SecuenciaNumerica {
    public static void main(String[] args) {
        int N = 12;
        List<Integer> secuencia = new ArrayList<>();
        secuencia.add(2);
        secuencia.add(7);

        int i = 2;
        while (secuencia.size() < N) {
            if (i % 2 == 0) {
                secuencia.add(secuencia.get(i - 1) * 2);
            } else {
                secuencia.add(secuencia.get(i - 1) + 7);
            }
            i++;
        }

        System.out.println(secuencia.subList(0, N));
    }
}
