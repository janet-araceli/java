import java.util.Scanner;

public class enunnumeroentero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int mcd = calcularMCD(num1, num2);

        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);

        scanner.close();
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
}
