import java.util.Scanner;

public class EncriptarFrase {
    public static String encriptarFrase(String frase) {
        String vocales = "aeiouAEIOU";
        StringBuilder fraseEncriptada = new StringBuilder();
        char vocalAnterior = ' ';
        for (char caracter : frase.toCharArray()) {
            if (vocales.indexOf(caracter) != -1) {
                int indiceVocal = vocales.indexOf(caracter);
                if (indiceVocal > 0) {
                    char caracterEncriptado = vocales.charAt(indiceVocal - 1);
                    fraseEncriptada.append(caracterEncriptado);
                } else {
                    fraseEncriptada.append(caracter);
                }
            } else {
                fraseEncriptada.append(caracter);
            }
        }
        return fraseEncriptada.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();
        String fraseEncriptada = encriptarFrase(frase);
        System.out.println("Frase original: " + frase);
        System.out.println("Frase encriptada: " + fraseEncriptada);
        scanner.close();
    }
}
