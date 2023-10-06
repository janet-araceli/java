import java.util.Scanner;

public class deunarreglodenumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();

        double[] numeros = new double[n];

        System.out.println("Ingrese los números:");

        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextDouble();
        }

        double suma = 0;

        for (double numero : numeros) {
            suma += numero;
        }

        double promedio = suma / n;

        System.out.println("El promedio de los números es: " + promedio);

        scanner.close();
    }
}
