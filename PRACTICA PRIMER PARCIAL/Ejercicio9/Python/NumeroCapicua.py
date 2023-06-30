def es_capicua(numero):
    numero_invertido = int(str(numero)[::-1])
    
    if numero == numero_invertido:
        return True
    else:
        return False

numero = int(input("Ingrese un número: "))

if es_capicua(numero):
    print("El número es capicúa.")
else:
    print("El número no es capicúa.")
