def generar_serie_pares_inversa(n):
    serie = []
    for i in range(n-1, 0, -1):
        if i % 2 == 0:
            serie.append(i)
    return serie

n = 7
serie_generada = generar_serie_pares_inversa(n)
print(serie_generada)