def generar_fibonacci(n):
    fibonacci = []
    a, b = 0, 1
    while len(fibonacci) < n:
        fibonacci.append(a)
        a, b = b, a + b
    return fibonacci

# Pedir al usuario el número de elementos de la secuencia
n = int(input("Ingresa el número de elementos de la secuencia de Fibonacci: "))

resultado = generar_fibonacci(n)
for num in resultado:
    print(num)
