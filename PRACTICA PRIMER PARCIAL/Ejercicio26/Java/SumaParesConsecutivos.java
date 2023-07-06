import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaParesConsecutivos {
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

        List<Pair<Pair<Integer, Integer>, Integer>> sumaPares = new ArrayList<>();
        for (int i = 0; i < numeros.size() - 1; i++) {
            int num1 = numeros.get(i);
            int num2 = numeros.get(i+1);
            int suma = num1 + num2;
            Pair<Integer, Integer> par = new Pair<>(num1, num2);
            sumaPares.add(new Pair<>(par, suma));
        }

        for (Pair<Pair<Integer, Integer>, Integer> parSuma : sumaPares) {
            Pair<Integer, Integer> par = parSuma.getKey();
            int suma = parSuma.getValue();
            System.out.println(par.getFirst() + " + " + par.getSecond() + " = " + suma);
        }
    }

    static class Pair<T, U> {
        private T first;
        private U second;

        public Pair(T first, U second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public U getSecond() {
            return second;
        }
    }
}
