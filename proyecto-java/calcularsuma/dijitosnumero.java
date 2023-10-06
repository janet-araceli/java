import java.util.Scanner;

public class dijitosnumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        int suma = 0;
        int temp = numero;

        while (temp > 0) {
            int digito = temp % 10;
            suma += digito;
            temp /= 10;
        }

        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);

        scanner.close();
    }
}
