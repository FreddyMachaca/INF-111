import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collatz {
    public static List<Integer> generarSecuenciaCollatz(int n) {
        List<Integer> secuencia = new ArrayList<>();
        secuencia.add(n);

        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n + 1;
            }
            secuencia.add(n);
        }

        return secuencia;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        List<Integer> secuenciaGenerada = generarSecuenciaCollatz(numero);
        System.out.println(secuenciaGenerada);
    }
}