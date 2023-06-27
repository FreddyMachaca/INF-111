filas = int(input("Ingrese el número de filas de la matriz: "))
columnas = int(input("Ingrese el número de columnas de la matriz: "))

matriz = []
for _ in range(filas):
    fila = list(map(int, input("Ingrese los elementos de la fila: ").split()))
    matriz.append(fila)

vectorSumaColumnas = [0] * columnas

for fila in matriz:
    for j in range(columnas):
        vectorSumaColumnas[j] += fila[j]

print("Vector suma de columnas:", vectorSumaColumnas)