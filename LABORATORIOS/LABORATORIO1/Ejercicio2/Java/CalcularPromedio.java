import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la primera nota (0-100):");
        int nota1 = scanner.nextInt();

        System.out.println("Ingrese la segunda nota (0-100):");
        int nota2 = scanner.nextInt();

        System.out.println("Ingrese la tercera nota (0-100):");
        int nota3 = scanner.nextInt();

        double promedio = (nota1 + nota2 + nota3) / 3.0;

        if (promedio >= 0 && promedio <= 50) {
            System.out.println("Reprobado");
        } else if (promedio >= 51 && promedio <= 69) {
            System.out.println("Aprobado y regular");
        } else if (promedio >= 70 && promedio <= 79) {
            System.out.println("Aprobado y bueno");
        } else if (promedio >= 80 && promedio <= 89) {
            System.out.println("Aprobado y muy bueno");
        } else if (promedio >= 90 && promedio <= 100) {
            System.out.println("Aprobado y excelente");
        } else {
            System.out.println("Promedio inválido");
        }
    }
}
