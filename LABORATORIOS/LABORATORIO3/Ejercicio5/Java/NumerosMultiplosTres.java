import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosMultiplosTres {
    public static int generarNumeroMultiplosTres(int x) {
        List<Integer> digitos = new ArrayList<>();
        while (x != 0) {
            digitos.add(x % 10);
            x = x / 10;
        }

        List<Integer> multiplosTres = new ArrayList<>();
        for (int i = 0; i < digitos.size(); i++) {
            int digito = digitos.get(i);
            if (digito % 3 == 0) {
                multiplosTres.add(digito);
            }
        }

        int y = 0;
        int multiplicador = 1;
        for (int i = 0; i < multiplosTres.size(); i++) {
            y += multiplosTres.get(i) * multiplicador;
            multiplicador *= 10;
        }

        return y;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int x = scanner.nextInt();
        int y = generarNumeroMultiplosTres(x);
        System.out.println("El número con los dígitos múltiplos de 3 es: " + y);
    }
}