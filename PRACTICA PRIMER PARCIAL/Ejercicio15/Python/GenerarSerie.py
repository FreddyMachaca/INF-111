def generar_serie(n):
    serie = []
    valor = n

    while valor >= 0:
        serie.append(valor)
        valor -= 5

    return serie

n = 20
serie = generar_serie(n)
print(serie)
