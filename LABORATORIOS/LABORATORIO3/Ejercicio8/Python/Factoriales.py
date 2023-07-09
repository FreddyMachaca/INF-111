def calcular_factorial(n):
    if n == 0:
        return 1
    else:
        return n * calcular_factorial(n-1)

def calcular_factoriales_lote():
    n = int(input("Ingrese la cantidad de números en el lote: "))
    lote = []

    for i in range(n):
        numero = int(input("Ingrese un número: "))
        lote.append(numero)

    factoriales = [calcular_factorial(num) for num in lote]
    return factoriales

resultado = calcular_factoriales_lote()
print("Los factoriales de los números son:", resultado)