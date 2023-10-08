#include <stdio.h>
#include <math.h>

int main() {
    double lado1, lado2, lado3;
    double perimetro, area, s;

    // Solicitar al usuario los valores de los lados del triángulo
    printf("Ingrese la longitud del primer lado: ");
    scanf("%lf", &lado1);

    printf("Ingrese la longitud del segundo lado: ");
    scanf("%lf", &lado2);

    printf("Ingrese la longitud del tercer lado: ");
    scanf("%lf", &lado3);

    // Calcular el perímetro
    perimetro = lado1 + lado2 + lado3;

    // Calcular el área usando la fórmula de Herón
    s = perimetro / 2; // Semiperímetro
    area = sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

    // Mostrar los resultados
    printf("El perimetro del triangulo es: %.2lf\n", perimetro);
    printf("El area del triangulo es: %.2lf\n", area);

    return 0;
}
