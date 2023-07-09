def calcular_producto_fibonacci(n):
    if n <= 0:
        return 0

    producto = 1
    a, b = 0, 1

    for _ in range(n):
        producto *= a
        a, b = b, a + b

    return producto

n_terminos = 8
producto_fibonacci = calcular_producto_fibonacci(n_terminos)
print(producto_fibonacci)