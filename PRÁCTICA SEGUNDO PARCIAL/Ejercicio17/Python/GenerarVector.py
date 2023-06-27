# Con input
vectorX = list(map(int, input("Ingrese los elementos del vector X: ").split()))

vectorInvertido = []
vectorDigitosCentrales = []

for numero in vectorX:
    numero_invertido = int(str(numero)[::-1])
    vectorInvertido.append(numero_invertido)

    digitos_centrales = str(numero)[1:-1]
    vectorDigitosCentrales.append(int(digitos_centrales))

print("Vector invertido:", vectorInvertido)
print("Vector dígitos centrales:", vectorDigitosCentrales)
