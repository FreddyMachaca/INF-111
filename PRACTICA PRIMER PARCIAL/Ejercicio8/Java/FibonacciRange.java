import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciRange {
    public static List<Integer> fibonacciRange(int a, int b) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int first = 0;
        int second = 1;
        
        while (first <= b) {
            if (first >= a) {
                fibonacciNumbers.add(first);
            }
            
            int temp = first + second;
            first = second;
            second = temp;
        }
        
        return fibonacciNumbers;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de a: ");
        int a = scanner.nextInt();
        
        System.out.print("Ingrese el valor de b: ");
        int b = scanner.nextInt();
        
        List<Integer> fibonacciNumbers = fibonacciRange(a, b);
        System.out.print("Los números de Fibonacci en el rango [" + a + ", " + b + "] son: ");
        
        for (int number : fibonacciNumbers) {
            System.out.print(number + " ");
        }
        
        scanner.close();
    }
}
