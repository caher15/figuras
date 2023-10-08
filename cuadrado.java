

import java.util.Scanner;

public class cuadrado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        double lado = input.nextDouble();

        // Calcular el área del cuadrado (lado * lado)
        double area = lado * lado;

        // Calcular el perímetro del cuadrado (4 * lado)
        double perimetro = 4 * lado;

        System.out.println("El área del cuadrado es: " + area);
        System.out.println("El perímetro del cuadrado es: " + perimetro);

        input.close();
    }
}
