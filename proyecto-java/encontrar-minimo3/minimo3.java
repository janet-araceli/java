import java.util.Scanner;

public class minimo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        int minimo = Math.min(Math.min(num1, num2), num3);

        System.out.println("El mínimo de los tres números es: " + minimo);

        scanner.close();
    }
}
