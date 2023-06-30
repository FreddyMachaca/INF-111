import java.util.Scanner;

public class NumeroCapicua {
    public static boolean esCapicua(int numero) {
        String numeroString = Integer.toString(numero);
        String numeroInvertidoString = new StringBuilder(numeroString).reverse().toString();
        int numeroInvertido = Integer.parseInt(numeroInvertidoString);
        
        if (numero == numeroInvertido) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        if (esCapicua(numero)) {
            System.out.println("El número es capicúa.");
        } else {
            System.out.println("El número no es capicúa.");
        }
        
        scanner.close();
    }
}