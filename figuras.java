
import java.util.Scanner;

public class figuras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.print("Ingresa el radio del círculo: ");
        double radio = scanner.nextDouble();
       
        double area = calcularAreaCirculo(radio);
        double perimetro = calcularPerimetroCirculo(radio);
       
        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
       
        scanner.close();
    }
   
    // Función para calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }
   
    // Función para calcular el perímetro de un círculo
    public static double calcularPerimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
}