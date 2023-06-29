import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double perimetro = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Perímetro de la circunferencia: " + perimetro);
        System.out.println("Área de la circunferencia: " + area);

        scanner.close();
    }
}
