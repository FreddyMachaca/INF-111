def obtener_digitos_centrales(numero):
    cadena = str(numero)
    longitud = len(cadena)
    if longitud % 2 == 0:
        centro = longitud // 2
        return int(cadena[centro - 1: centro + 1])
    else:
        centro = longitud // 2
        return int(cadena[centro])

def mostrar_digitos_centrales_lote():
    lote = input("Ingrese los números separados por espacios: ")
    numeros = lote.split()
    for numero in numeros:
        digitos_centrales = obtener_digitos_centrales(numero)
        print(f"Los dígitos centrales de {numero} son: {digitos_centrales}")


mostrar_digitos_centrales_lote()
