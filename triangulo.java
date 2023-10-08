import java.util.Scanner;

public class triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la longitud del primer lado del triángulo: ");
        double lado1 = input.nextDouble();

        System.out.print("Ingrese la longitud del segundo lado del triángulo: ");
        double lado2 = input.nextDouble();

        System.out.print("Ingrese la longitud del tercer lado del triángulo: ");
        double lado3 = input.nextDouble();

        // Calcular el perímetro del triángulo
        double perimetro = lado1 + lado2 + lado3;

        // Calcular el área del triángulo usando la fórmula de Herón
        double s = perimetro / 2;
        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        System.out.println("El perímetro del triángulo es: " + perimetro);
        System.out.println("El área del triángulo es: " + area);

        input.close();
    }
}






    

