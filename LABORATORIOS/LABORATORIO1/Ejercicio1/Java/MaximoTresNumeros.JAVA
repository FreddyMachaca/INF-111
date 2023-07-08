import java.util.Scanner;

public class MaximoTresNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int numero3 = scanner.nextInt();

        int maximo = numero1;

        if (numero2 > maximo) {
            maximo = numero2;
        }

        if (numero3 > maximo) {
            maximo = numero3;
        }

        System.out.println("El número máximo es: " + maximo);
    }
}
