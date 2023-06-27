matriz = [
    [1, 2, 0, 3, 4],
    [5, 6, 0, 7, 8],
    [0, 0, 0, 0, 0],
    [9, 1, 0, 1, 1],
    ['', 0, '', 1, 2],
    [13, 1, 0, 1, 1],
    ['', 4, '', 5, 6]
]

# Imprimir la matriz
for fila in matriz:
    print("|", end="")
    for elemento in fila:
        if elemento == '':
            print("   |", end="")
        else:
            print(f" {elemento} |", end="")
    print("\n" + "-" * 28)
