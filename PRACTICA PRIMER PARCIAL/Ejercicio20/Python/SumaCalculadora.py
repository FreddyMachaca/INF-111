def calcular_suma(n):
    suma = 0
    for i in range(1, n+1):
        termino = (2 * i) / 5
        suma += termino
    return suma

n = 10  # Número de términos a sumar
resultado = calcular_suma(n)
print("Resultado:", resultado)
