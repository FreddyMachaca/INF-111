def eliminar_vocales(cadena):
    vocales = "aeiouAEIOU"
    nueva_cadena = ""
    for caracter in cadena:
        if caracter not in vocales:
            nueva_cadena += caracter
    return nueva_cadena

cadena = input("Ingrese una cadena: ")
cadena_sin_vocales = eliminar_vocales(cadena)
print("Cadena original:", cadena)
print("Cadena sin vocales:", cadena_sin_vocales)
