import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetraMasRepetida {
    public static char letraMasRepetida(String cadena) {
        Map<Character, Integer> contador = new HashMap<>();
        for (char caracter : cadena.toCharArray()) {
            contador.put(caracter, contador.getOrDefault(caracter, 0) + 1);
        }
        char letraMasRepetida = ' ';
        int maxRepeticiones = 0;
        for (Map.Entry<Character, Integer> entry : contador.entrySet()) {
            if (entry.getValue() > maxRepeticiones) {
                letraMasRepetida = entry.getKey();
                maxRepeticiones = entry.getValue();
            }
        }
        return letraMasRepetida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        char letraRepetida = letraMasRepetida(cadena);
        System.out.println("La letra que más se repite en la cadena es: " + letraRepetida);
        scanner.close();
    }
}
