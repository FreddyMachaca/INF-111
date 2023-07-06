import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisoresPares {
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

        List<Pair<Integer, List<Integer>>> divisoresPares = new ArrayList<>();
        for (int num : numeros) {
            if (num % 2 == 0) {
                List<Integer> divisores = new ArrayList<>();
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        divisores.add(i);
                    }
                }
                divisoresPares.add(new Pair<>(num, divisores));
            }
        }

        for (Pair<Integer, List<Integer>> par : divisoresPares) {
            int numero = par.getKey();
            List<Integer> divisores = par.getValue();
            System.out.println("Divisores pares de " + numero + ": " + divisores);
        }
    }

    static class Pair<K, V> {
        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }
}