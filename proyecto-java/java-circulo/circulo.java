import java.util.Scanner;

public class circulo {
    public static void main(String[] args) {
        final double PI = 3.14159; // Definir el valor de pi
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();
        
        double area = PI * Math.pow(radio, 2); // Calcular el área del círculo
        
        System.out.println("El área del círculo es: " + area); // Mostrar el resultado
        
        scanner.close(); // Cerrar el Scanner
    }
}
