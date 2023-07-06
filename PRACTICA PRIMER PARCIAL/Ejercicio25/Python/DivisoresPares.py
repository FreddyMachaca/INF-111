n = int(input("Ingrese la cantidad de números en el lote: "))
numeros = []
for i in range(n):
    numero = int(input("Ingrese el número " + str(i+1) + ": "))
    numeros.append(numero)

divisores_pares = []
for num in numeros:
    if num % 2 == 0:
        divisores = [i for i in range(1, num+1) if num % i == 0]
        divisores_pares.append((num, divisores))

for par in divisores_pares:
    numero = par[0]
    divisores = par[1]
    print("Divisores pares de", numero, ":", divisores)