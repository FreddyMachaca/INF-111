import java.util.Scanner;

public class Multiplos {
    public static boolean esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        
        if (esMultiplo(numero1, numero2)) {
            System.out.println("Uno de los números es múltiplo del otro.");
        } else {
            System.out.println("Los números no son múltiplos entre sí.");
        }
        
        scanner.close();
    }
}
