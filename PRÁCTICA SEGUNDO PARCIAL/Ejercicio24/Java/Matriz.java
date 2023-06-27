public class Matriz {
    public static void main(String[] args) {
        String[][] matriz = {
            {"1", "2", "0", "3", "4"},
            {"5", "6", "0", "7", "8"},
            {"0", "0", "0", "0", "0"},
            {"9", "1", "0", "1", "1"},
            {" ", "0", " ", "1", "2"},
            {"13", "1", "0", "1", "1"},
            {" ", "4", " ", "5", "6"}
        };

        // Imprimir la matriz
        for (String[] fila : matriz) {
            System.out.print("|");
            for (String elemento : fila) {
                if (elemento.equals(" ")) {
                    System.out.print("   |");
                } else {
                    System.out.printf(" %s |", elemento);
                }
            }
            System.out.println("\n---------------------------");
        }
    }
}
