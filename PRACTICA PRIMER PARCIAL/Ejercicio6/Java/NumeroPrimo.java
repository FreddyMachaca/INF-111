import java.util.Scanner;

public class NumeroPrimo {
    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número de un solo dígito: ");
        int numero = scanner.nextInt();
        
        if (esPrimo(numero)) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
        
        scanner.close();
    }
}
