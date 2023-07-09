def calcular_suma_secuencia(n):
    suma = 0
    multiplicador = 1

    for i in range(1, n + 1):
        termino = i * multiplicador
        suma += termino
        multiplicador *= -2

    return suma

n_terminos = 6
suma_secuencia = calcular_suma_secuencia(n_terminos)
print(suma_secuencia)