import java.util.Scanner;

public class InversoNumero {
    public static int calcularInverso(int x) {
        int inverso = 0;
        while (x != 0) {
            inverso = inverso * 10 + x % 10;
            x = x / 10;
        }
        return inverso;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int x = scanner.nextInt();
        int inverso = calcularInverso(x);
        System.out.println("El inverso del número es: " + inverso);
    }
}