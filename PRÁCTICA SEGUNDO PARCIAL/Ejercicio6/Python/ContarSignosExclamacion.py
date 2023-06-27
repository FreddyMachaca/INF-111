def contar_signos_exclamacion(cadena):
    contador = 0
    for caracter in cadena:
        if caracter == '!':
            contador += 1
    return contador

cadena = input("Ingrese una cadena: ")
cantidad_signos = contar_signos_exclamacion(cadena)
print("La cadena tiene", cantidad_signos, "signos de exclamación.")
