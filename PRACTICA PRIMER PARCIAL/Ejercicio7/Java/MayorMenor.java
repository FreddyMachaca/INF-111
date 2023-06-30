import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();
        
        System.out.print("Ingrese el cuarto número: ");
        int num4 = scanner.nextInt();
        
        System.out.print("Ingrese el quinto número: ");
        int num5 = scanner.nextInt();
        
        int maximo = Math.max(Math.max(Math.max(num1, num2), Math.max(num3, num4)), num5);
        int minimo = Math.min(Math.min(Math.min(num1, num2), Math.min(num3, num4)), num5);
        
        System.out.println("El número máximo es: " + maximo);
        System.out.println("El número mínimo es: " + minimo);
        
        scanner.close();
    }
}
