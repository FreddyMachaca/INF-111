def mostrar_ultimo_digito():
    n = int(input("Ingrese la cantidad de números en el lote: "))
    lote = []

    for i in range(n):
        numero = int(input("Ingrese un número: "))
        lote.append(numero)

    ultimos_digitos = [num % 10 for num in lote]
    return ultimos_digitos

resultado = mostrar_ultimo_digito()
print("Los últimos dígitos son:", resultado)