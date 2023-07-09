import java.util.Scanner;

public class UnirNumeros {
    public static int unirNumeros(int x, int y) {
        String strX = Integer.toString(x);
        String strY = Integer.toString(y);
        String strZ = strX + strY;
        int z = Integer.parseInt(strZ);
        return z;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int x = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int y = scanner.nextInt();
        int z = unirNumeros(x, y);
        System.out.println("El tercer número obtenido es: " + z);
    }
}