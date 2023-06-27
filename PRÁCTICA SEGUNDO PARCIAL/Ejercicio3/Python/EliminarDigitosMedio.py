def eliminar_digitos_medio(numero):
    cadena = str(numero)
    longitud = len(cadena)
    if longitud <= 2:
        return 0  # No hay dígitos del medio para eliminar
    elif longitud % 2 == 0:
        centro = longitud // 2
        nueva_cadena = cadena[:centro - 1] + cadena[centro + 1:]
    else:
        centro = longitud // 2
        nueva_cadena = cadena[:centro] + cadena[centro + 1:]
    return int(nueva_cadena)

def eliminar_digitos_medio_lote():
    lote = input("Ingrese los números separados por espacios: ")
    numeros = lote.split()
    for numero in numeros:
        numero_sin_digito_medio = eliminar_digitos_medio(numero)
        print(f"El número {numero} sin el o los dígitos del medio es: {numero_sin_digito_medio}")


eliminar_digitos_medio_lote()
