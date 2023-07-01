import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecuenciaPatron {
    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();
        int count = 1;
        
        for (int i = 0; i < n; i++) {
            if (count % 2 == 0) {
                secuencia.add(count + 1);
            } else {
                secuencia.add(count);
            }
            
            count += 2;
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
