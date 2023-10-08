#include <stdio.h>

int main() {
    float lado;
    printf("Ingresa la longitud del lado del cuadrado: ");
    scanf("%f", &lado);

    float area = lado * lado;
    float perimetro = 4 * lado;

    printf("Area del cuadrado: %.2f\n", area);
    printf("Perimetro del cuadrado: %.2f\n", perimetro);

    return 0;
}