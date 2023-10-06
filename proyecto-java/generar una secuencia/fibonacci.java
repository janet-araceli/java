import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de términos de la secuencia de Fibonacci que desea generar: ");
        int n = scanner.nextInt();

        int primerTermino = 0;
        int segundoTermino = 1;

        System.out.print("Secuencia de Fibonacci: " + primerTermino + ", " + segundoTermino);

        for (int i = 3; i <= n; i++) {
            int siguienteTermino = primerTermino + segundoTermino;
            System.out.print(", " + siguienteTermino);
            primerTermino = segundoTermino;
            segundoTermino = siguienteTermino;
        }

        scanner.close();
    }
}
