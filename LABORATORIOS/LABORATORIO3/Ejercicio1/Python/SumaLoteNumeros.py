def sumar_lote_numeros():
    n = int(input("Ingrese la cantidad de números en el lote: "))
    lote = []

    for i in range(n):
        numero = int(input("Ingrese un número: "))
        lote.append(numero)

    suma = sum(lote)
    return suma

resultado = sumar_lote_numeros()
print("La suma de los números es:", resultado)