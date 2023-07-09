def mostrar_multiplos_de_cinco():
    n = int(input("Ingrese la cantidad de números en el lote: "))
    lote = []

    for i in range(n):
        numero = int(input("Ingrese un número: "))
        lote.append(numero)

    multiplos_de_cinco = [num for num in lote if num % 5 == 0]
    return multiplos_de_cinco

resultado = mostrar_multiplos_de_cinco()
print("Los múltiplos de 5 son:", resultado)