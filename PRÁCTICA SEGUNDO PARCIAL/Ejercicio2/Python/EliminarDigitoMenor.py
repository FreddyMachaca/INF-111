def eliminar_digito_menor(numero):
    cadena = str(numero)
    digito_menor = min(cadena)
    nueva_cadena = cadena.replace(digito_menor, '', 1)
    if nueva_cadena == '':
        nueva_cadena = '0'
    return int(nueva_cadena)

def eliminar_digito_menor_lote():
    lote = input("Ingrese los números separados por espacios: ")
    numeros = lote.split()
    for numero in numeros:
        numero_sin_digito = eliminar_digito_menor(numero)
        print(f"El número {numero} sin el dígito menor es: {numero_sin_digito}")


eliminar_digito_menor_lote()
