def encriptar_frase(frase):
    vocales = "aeiouAEIOU"
    frase_encriptada = ""
    vocal_anterior = ""
    for caracter in frase:
        if caracter in vocales:
            indice_vocal = vocales.index(caracter)
            if indice_vocal > 0:
                caracter_encriptado = vocales[indice_vocal - 1]
                frase_encriptada += caracter_encriptado
            else:
                frase_encriptada += caracter
        else:
            frase_encriptada += caracter
    return frase_encriptada

frase = input("Ingrese una frase: ")
frase_encriptada = encriptar_frase(frase)
print("Frase original:", frase)
print("Frase encriptada:", frase_encriptada)
