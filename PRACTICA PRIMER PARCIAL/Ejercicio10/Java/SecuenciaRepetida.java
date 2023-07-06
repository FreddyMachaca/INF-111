import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecuenciaRepetida {
    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int numero = i * 2;
            secuencia.add(numero);
            secuencia.add(numero);
        }

        return secuencia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de términos: ");
        int n = scanner.nextInt();

        List<Integer> secuencia = generarSecuencia(n);
        System.out.println("La secuencia generada es: " + secuencia);
    }
}