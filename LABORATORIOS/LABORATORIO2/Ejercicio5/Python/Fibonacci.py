def calcular_suma_fibonacci(n):
    if n <= 0:
        return 0

    suma = 0
    a, b = 0, 1

    for _ in range(n):
        suma += a
        a, b = b, a + b

    return suma

n_terminos = 8
suma_fibonacci = calcular_suma_fibonacci(n_terminos)
print(suma_fibonacci)
