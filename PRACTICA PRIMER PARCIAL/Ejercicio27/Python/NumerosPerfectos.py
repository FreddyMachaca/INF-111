def es_perfecto(numero):
    suma_divisores = sum(i for i in range(1, numero) if numero % i == 0)
    return suma_divisores == numero

n = int(input("Ingrese la cantidad de números en el lote: "))
numeros = []
for i in range(n):
    numero = int(input("Ingrese el número " + str(i+1) + ": "))
    numeros.append(numero)

for numero in numeros:
    if es_perfecto(numero):
        print(numero, "es un número perfecto")
    else:
        print(numero, "no es un número perfecto")