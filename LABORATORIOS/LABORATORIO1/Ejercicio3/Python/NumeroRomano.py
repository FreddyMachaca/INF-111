def obtener_numero_romano(numero):
    simbolos = ["I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"]
    valores = [1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000]

    resultado = ""

    indice = len(simbolos) - 1

    while numero > 0:
        if numero >= valores[indice]:
            resultado += simbolos[indice]
            numero -= valores[indice]
        else:
            indice -= 1

    return resultado

numero = int(input("Ingrese un número entero entre 1 y 20: "))

numero_romano = obtener_numero_romano(numero)

if numero_romano == "":
    print("Número inválido")
else:
    print("El equivalente romano es:", numero_romano)