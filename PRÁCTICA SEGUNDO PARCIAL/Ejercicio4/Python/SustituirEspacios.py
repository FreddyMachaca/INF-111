def sustituir_espacios(cadena):
    nueva_cadena = cadena.replace(" ", "$$$$$")
    return nueva_cadena

cadena = input("Ingrese una cadena: ")
cadena_sustituida = sustituir_espacios(cadena)
print("Cadena original:", cadena)
print("Cadena sustituida:", cadena_sustituida)
