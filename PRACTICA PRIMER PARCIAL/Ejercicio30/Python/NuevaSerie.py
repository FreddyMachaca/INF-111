def generar_serie(n):
    serie = []
    for i in range(n):
        if i % 3 == 0:
            serie.append(5 + i // 3 * 9)
        else:
            serie.append(3 - i % 3 * 2)
    return serie

# Lectura de entrada
n = int(input("Ingrese el número de términos de la serie: "))

# Generar y mostrar la serie
serie = generar_serie(n)
print(" ".join(map(str, serie)))
