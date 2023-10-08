#include <stdio.h>
#include <math.h>

int main() {
    double radio, area, perimetro;
    const double pi = 3.14159265359; // Valor de pi

    // Solicitar al usuario el valor del radio
    printf("Ingrese el radio del circulo: ");
    scanf("%lf", &radio);

    // Calcular el área y el perímetro del círculo
    area = pi * radio * radio;
    perimetro = 2 * pi * radio;

    // Mostrar los resultados
    printf("El area del circulo es: %.2lf\n", area);
    printf("El perimetro del circulo es: %.2lf\n", perimetro);

    return 0;
}
