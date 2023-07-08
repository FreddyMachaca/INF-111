print("Ingrese el primer número:")
numero1 = int(input())

print("Ingrese el segundo número:")
numero2 = int(input())

print("Ingrese el tercer número:")
numero3 = int(input())

maximo = numero1

if numero2 > maximo:
    maximo = numero2

if numero3 > maximo:
    maximo = numero3

print("El número máximo es:", maximo)
