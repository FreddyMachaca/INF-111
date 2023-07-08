import java.util.Scanner;

public class NumeroRomano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero entre 1 y 20:");
        int numero = scanner.nextInt();

        String numeroRomano = obtenerNumeroRomano(numero);

        if (numeroRomano.equals("")) {
            System.out.println("Número inválido");
        } else {
            System.out.println("El equivalente romano es: " + numeroRomano);
        }
    }

    public static String obtenerNumeroRomano(int numero) {
        String[] simbolos = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] valores = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder resultado = new StringBuilder();

        int indice = simbolos.length - 1;

        while (numero > 0) {
            if (numero >= valores[indice]) {
                resultado.append(simbolos[indice]);
                numero -= valores[indice];
            } else {
                indice--;
            }
        }

        return resultado.toString();
    }
}