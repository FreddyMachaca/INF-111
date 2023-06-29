import java.util.Scanner;

public class OctagonoRegular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del lado del octágono regular: ");
        double lado = scanner.nextDouble();

        double perimetro = 8 * lado;
        double apotema = lado / Math.sqrt(2);
        double area = (perimetro * apotema) / 2;

        System.out.println("Perímetro del octágono: " + perimetro);
        System.out.println("Área del octágono: " + area);

        scanner.close();
    }
}
