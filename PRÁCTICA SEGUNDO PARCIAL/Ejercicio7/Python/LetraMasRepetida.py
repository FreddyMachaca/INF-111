from collections import Counter

def letra_mas_repetida(cadena):
    contador = Counter(cadena)
    letra_mas_comun = contador.most_common(1)[0][0]
    return letra_mas_comun

cadena = input("Ingrese una cadena: ")
letra_repetida = letra_mas_repetida(cadena)
print("La letra que más se repite en la cadena es:", letra_repetida)
