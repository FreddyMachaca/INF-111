# Con input
vectorX = list(map(int, input("Ingrese los elementos del vector X: ").split()))

vectorSumaAcumulada = []
suma = 0

for numero in vectorX:
    suma += numero
    vectorSumaAcumulada.append(suma)

print("Vector suma acumulada:", vectorSumaAcumulada)
