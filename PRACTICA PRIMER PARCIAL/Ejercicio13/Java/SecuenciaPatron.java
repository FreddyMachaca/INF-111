import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SecuenciaPatron {
    public static List<Integer> generarSecuencia(int n) {
        List<Integer> secuencia = new ArrayList<>();
        secuencia.add(0);
        secuencia.add(1);
        
        for (int i = 2; i < n; i++) {
            int nuevoTermino = secuencia.get(i - 1) + secuencia.get(i - 2) - 1;
            secuencia.add(nuevoTermino);
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
