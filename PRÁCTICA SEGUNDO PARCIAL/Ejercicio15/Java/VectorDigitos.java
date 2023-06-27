import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        ArrayList<Integer> digitosImpares = new ArrayList<>();
        ArrayList<Integer> digitosPares = new ArrayList<>();

        String numeroStr = Integer.toString(numero);
        for (int i = 0; i < numeroStr.length(); i++) {
            int digito = Character.getNumericValue(numeroStr.charAt(i));
            if (digito % 2 == 0) {
                digitosPares.add(digito);
            } else {
                digitosImpares.add(digito);
            }
        }

        System.out.println("Dígitos pares: " + digitosPares);
        System.out.println("Dígitos impares: " + digitosImpares);
    }
}