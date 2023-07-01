import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecuenciaInterpolada {
    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();
        int count = 0;
        int value = 0;
        
        for (int i = 0; i < n; i++) {
            secuencia.add(value);
            count++;
            
            if (count == value + 1) {
                value = 1 - value;
                count = 0;
            }
        }
        
        return secuencia;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de términos: ");
        int n = scanner.nextInt();
        
        List<Integer> secuencia = generarSecuencia(n);
        System.out.println("La secuencia generada es: " + secuencia);
        
        scanner.close();
    }
}