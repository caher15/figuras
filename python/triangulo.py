# Solicitar al usuario las longitudes de los lados del triángulo
lado1 = float(input("Ingrese la longitud del primer lado del triángulo: "))
lado2 = float(input("Ingrese la longitud del segundo lado del triángulo: "))
lado3 = float(input("Ingrese la longitud del tercer lado del triángulo: "))

# Calcular el perímetro del triángulo
perimetro = lado1 + lado2 + lado3

# Calcular el semiperímetro para usarlo en el cálculo del área
semiperimetro = perimetro / 2

# Calcular el área del triángulo utilizando la fórmula de Herón
area = (semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3)) ** 0.5

# Mostrar los resultados
print("El perímetro del triángulo es:", perimetro)
print("El área del triángulo es:", area)
