n = int(input("Ingrese la cantidad de números en el lote: "))
numeros = []
for i in range(n):
    numero = int(input("Ingrese el número " + str(i+1) + ": "))
    numeros.append(numero)

suma_pares = []
for i in range(len(numeros) - 1):
    par = (numeros[i], numeros[i+1])
    suma = sum(par)
    suma_pares.append((par, suma))

for par, suma in suma_pares:
    print(par[0], "+", par[1], "=", suma)