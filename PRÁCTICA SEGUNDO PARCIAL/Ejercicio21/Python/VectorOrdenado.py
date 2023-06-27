filas = int(input("Ingrese el número de filas de la matriz: "))
columnas = int(input("Ingrese el número de columnas de la matriz: "))

matriz = []
for _ in range(filas):
    fila = list(map(int, input("Ingrese los elementos de la fila: ").split()))
    matriz.append(fila)

for i in range(filas):
    for j in range(columnas):
        if matriz[i][j] < 0:
            matriz[i][j] = 0

print("Matriz resultante:")
for fila in matriz:
    print(*fila)
