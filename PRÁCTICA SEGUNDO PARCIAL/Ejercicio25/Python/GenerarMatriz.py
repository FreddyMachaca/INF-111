def generar_matriz_triangular_superior(n):
    matriz = []
    numero = 1

    for i in range(n):
        fila = []
        for j in range(n):
            if j >= i:
                fila.append(numero)
                numero += 3
            else:
                fila.append('')
        matriz.append(fila)

    return matriz

def imprimir_matriz(matriz):
    for fila in matriz:
        print("|", end="")
        for elemento in fila:
            if elemento == '':
                print("    |", end="")
            else:
                print(f" {elemento:2} |", end="")
        print("\n" + "-" * 33)

n = 5  # Tamaño de la matriz cuadrada
matriz = generar_matriz_triangular_superior(n)
imprimir_matriz(matriz)
