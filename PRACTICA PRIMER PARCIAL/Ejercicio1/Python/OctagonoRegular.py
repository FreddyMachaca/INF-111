import math

lado = float(input("Ingrese la longitud del lado del octágono regular: "))

perimetro = 8 * lado
apotema = lado / math.sqrt(2)
area = (perimetro * apotema) / 2

print("Perímetro del octágono:", perimetro)
print("Área del octágono:", area)
