import java.util.Scanner;

public class MenuOperaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Mostrar el menor de 4 números");
            System.out.println("2. Indicar si un número es positivo, negativo o nulo");
            System.out.println("3. Hallar el producto y la potencia de 2 números enteros");
            System.out.println("4. Hallar el promedio de 5 números");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opción:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarMenorDeCuatroNumeros(scanner);
                    break;
                case 2:
                    indicarSignoDeNumero(scanner);
                    break;
                case 3:
                    calcularProductoYPotencia(scanner);
                    break;
                case 4:
                    calcularPromedioDeCincoNumeros(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
    }

    public static void mostrarMenorDeCuatroNumeros(Scanner scanner) {
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int numero3 = scanner.nextInt();

        System.out.println("Ingrese el cuarto número:");
        int numero4 = scanner.nextInt();

        int menor = Math.min(Math.min(numero1, numero2), Math.min(numero3, numero4));

        System.out.println("El menor número es: " + menor);
    }

    public static void indicarSignoDeNumero(Scanner scanner) {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es nulo");
        }
    }

    public static void calcularProductoYPotencia(Scanner scanner) {
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        int producto = numero1 * numero2;
        int potencia = (int) Math.pow(numero1, numero2);

        System.out.println("El producto de los números es: " + producto);
        System.out.println("La potencia del primer número elevado al segundo número es: " + potencia);
    }

    public static void calcularPromedioDeCincoNumeros(Scanner scanner) {
        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int numero3 = scanner.nextInt();

        System.out.println("Ingrese el cuarto número:");
        int numero4 = scanner.nextInt();

        System.out.println("Ingrese el quinto número:");
        int numero5 = scanner.nextInt();

        double promedio = (numero1 + numero2 + numero3 + numero4 + numero5) / 5.0;

        System.out.println("El promedio de los números es: " + promedio);
    }
}