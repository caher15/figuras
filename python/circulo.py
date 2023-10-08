import math

# Solicitar al usuario el radio del círculo
radio = float(input("Ingrese el radio del círculo: "))

# Calcular el área del círculo (pi * radio^2)
area = math.pi * radio ** 2

# Calcular el perímetro del círculo (2 * pi * radio)
perimetro = 2 * math.pi * radio

# Mostrar los resultados
print("El área del círculo es:", area)
print("El perímetro del círculo es:", perimetro)
