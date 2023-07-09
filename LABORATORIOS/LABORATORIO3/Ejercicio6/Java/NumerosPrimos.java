import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimos {
    public static int generarNumeroDigitosPrimos(int x) {
        List<Integer> digitos = new ArrayList<>();
        while (x != 0) {
            digitos.add(x % 10);
            x = x / 10;
        }

        List<Integer> primos = new ArrayList<>();
        for (int i = 0; i < digitos.size(); i++) {
            int digito = digitos.get(i);
            if (esPrimo(digito)) {
                primos.add(digito);
            }
        }

        int y = 0;
        int multiplicador = 1;
        for (int i = 0; i < primos.size(); i++) {
            y += primos.get(i) * multiplicador;
            multiplicador *= 10;
        }

        return y;
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int x = scanner.nextInt();
        int y = generarNumeroDigitosPrimos(x);
        System.out.println("El número con los dígitos primos es: " + y);
    }
}