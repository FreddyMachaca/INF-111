import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumerosPerfectos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números en el lote: ");
        int n = scanner.nextInt();

        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i+1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        for (int numero : numeros) {
            if (esPerfecto(numero)) {
                System.out.println(numero + " es un número perfecto");
            } else {
                System.out.println(numero + " no es un número perfecto");
            }
        }
    }

    public static boolean esPerfecto(int numero) {
        int sumaDivisores = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }
        return sumaDivisores == numero;
    }
}
